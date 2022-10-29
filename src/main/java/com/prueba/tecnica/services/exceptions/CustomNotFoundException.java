package com.prueba.tecnica.services.exceptions;

public class CustomNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -390777707828072497L;
    
    public CustomNotFoundException(String message) {
        super(message);
    }
}
