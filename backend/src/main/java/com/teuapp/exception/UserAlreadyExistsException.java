package com.teuapp.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException() {
        super("E-mail já cadastrado");
    }
}
