package com.teachmeskills.lesson13.homework.solution2.validation;

import com.teachmeskills.lesson13.homework.solution2.util.symbols_limit.ISymbolsLimit;
import com.teachmeskills.lesson13.homework.solution2.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.homework.solution2.custom_exception.WrongPasswordException;

public class Validator implements ISymbolsLimit {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= ISymbolsLimit.SYMBOLS_LIMIT || login.contains(" ")) {
            throw new WrongLoginException("Wrong login format");
        }

        char[] passwordArray = password.toCharArray();
        if (passwordArray.length >= ISymbolsLimit.SYMBOLS_LIMIT || containsSpace(passwordArray) || !containsDigit(passwordArray) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password format");
        }

        return true;
    }

    private static boolean containsSpace(char[] array) {
        for (char c : array) {
            if (c == ' ') {
                return true;
            }
        }
        return false;
    }

    private static boolean containsDigit(char[] array) {
        for (char c : array) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
