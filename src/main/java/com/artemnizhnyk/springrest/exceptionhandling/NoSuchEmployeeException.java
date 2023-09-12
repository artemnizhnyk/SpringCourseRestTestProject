package com.artemnizhnyk.springrest.exceptionhandling;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(final String message) {
        super(message);
    }
}
