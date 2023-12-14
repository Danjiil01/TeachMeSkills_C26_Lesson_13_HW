package com.teachmeskills.lesson13.homework.solution1.validation;

import com.teachmeskills.lesson13.homework.solution1.util.symbols_limit.ISymbolsLimit;
import com.teachmeskills.lesson13.homework.solution1.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.homework.solution1.custom_exception.WrongPasswordException;

public class Validator implements ISymbolsLimit {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= ISymbolsLimit.SYMBOLS_LIMIT || login.contains(" ")) {
                throw new WrongLoginException();
            }

            if (password.length() >= ISymbolsLimit.SYMBOLS_LIMIT || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
    }
}
