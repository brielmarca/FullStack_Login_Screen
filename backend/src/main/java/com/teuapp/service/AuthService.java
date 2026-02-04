package com.teuapp.service;

import com.teuapp.domain.User;
import com.teuapp.dto.LoginRequest;
import com.teuapp.exception.InvalidCredentialsException;
import com.teuapp.exception.UserAlreadyExistsException;
import com.teuapp.repository.UserRepository;
import java.time.LocalDateTime;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
            .orElseThrow(InvalidCredentialsException::new);

        boolean ok = passwordEncoder.matches(request.getPassword(), user.getPassword());
        if (!ok) {
            throw new InvalidCredentialsException();
        }
    }

    public void register(LoginRequest request) {
        boolean exists = userRepository.findByEmail(request.getEmail()).isPresent();
        if (exists) {
            throw new UserAlreadyExistsException();
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setCreatedAt(LocalDateTime.now());

        userRepository.save(user);
    }
}
