package com.TrungTinhFullStack.Backend_Java.Exception;

public class FileExistsException extends RuntimeException{
    public FileExistsException(String message) {
        super(message);
    }
}
