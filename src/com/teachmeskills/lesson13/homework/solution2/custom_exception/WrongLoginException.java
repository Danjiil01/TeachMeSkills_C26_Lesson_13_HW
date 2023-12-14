package com.teachmeskills.lesson13.homework.solution2.custom_exception;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
