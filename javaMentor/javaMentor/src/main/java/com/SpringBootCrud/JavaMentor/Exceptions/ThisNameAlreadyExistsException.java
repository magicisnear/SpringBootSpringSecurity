package com.SpringBootCrud.JavaMentor.Exceptions;

public class ThisNameAlreadyExistsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ThisNameAlreadyExistsException(String message) {
        super(message);
    }
}
