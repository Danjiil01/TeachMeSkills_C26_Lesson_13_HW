package com.teachmeskills.lesson13.homework.solution2.custom_exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
