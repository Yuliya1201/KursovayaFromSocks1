package com.example.kursovayafromsocks1.dto.responce;


import lombok.Data;

@Data
public class ErrorResponse {
    private final int status;
    private final String error;
    private final String message;
}

