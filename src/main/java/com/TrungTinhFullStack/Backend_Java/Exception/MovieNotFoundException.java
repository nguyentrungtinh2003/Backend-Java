package com.TrungTinhFullStack.Backend_Java.Exception;

public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(String message) {
        super(message);
    }
}
