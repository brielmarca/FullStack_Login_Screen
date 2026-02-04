package com.teuapp.controller;

import com.teuapp.dto.LoginRequest;
import com.teuapp.dto.LoginResponse;
import com.teuapp.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = { "http://localhost:5500", "http://192.168.0.165:5500" })
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        authService.login(request);
        return ResponseEntity.ok(new LoginResponse(true, "Login realizado com sucesso"));
    }

    @PostMapping("/register")
    public ResponseEntity<LoginResponse> register(@Valid @RequestBody LoginRequest request) {
        authService.register(request);
        return ResponseEntity.ok(new LoginResponse(true, "Cadastro realizado com sucesso"));
    }
}
