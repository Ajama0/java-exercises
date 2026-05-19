package com.amigoscode._2_developers._10_exceptions;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);

    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
