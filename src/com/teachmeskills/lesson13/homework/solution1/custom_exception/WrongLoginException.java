package com.teachmeskills.lesson13.homework.solution1.custom_exception;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super("Wrong login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
