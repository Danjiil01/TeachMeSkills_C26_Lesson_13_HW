package com.teachmeskills.lesson13.homework.solution1.custom_exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        super("Wrong password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
