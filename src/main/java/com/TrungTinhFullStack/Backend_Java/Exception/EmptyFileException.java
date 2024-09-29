package com.TrungTinhFullStack.Backend_Java.Exception;

public class EmptyFileException extends RuntimeException{
    public EmptyFileException(String message) {
        super(message);
    }
}
