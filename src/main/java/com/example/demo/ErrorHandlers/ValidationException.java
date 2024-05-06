package com.example.demo.ErrorHandlers;

public class ValidationException extends RuntimeException{

    public ValidationException(String message) {
        super(message);
    }
}
