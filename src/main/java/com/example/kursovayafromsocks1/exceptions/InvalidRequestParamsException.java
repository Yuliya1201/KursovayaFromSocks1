package com.example.kursovayafromsocks1.exceptions;


public class InvalidRequestParamsException extends Exception {
    public InvalidRequestParamsException(String message) {
        super(message);
    }

    public InvalidRequestParamsException(String message, Throwable cause) {
        super(message, cause);
    }
}

