package com.teachmeskills.lesson13.homework.solution2;

import com.teachmeskills.lesson13.homework.solution2.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.homework.solution2.custom_exception.WrongPasswordException;
import com.teachmeskills.lesson13.homework.solution2.validation.Validator;

public class Runner {
    public static void main(String[] args) {
        String testLogin = "user123";
        String testPassword = "passw0rd";
        String testConfirmPassword = "passw0rd";

        try {
            boolean isValid = Validator.validate(testLogin, testPassword, testConfirmPassword);
            System.out.println("Validation result: " + isValid);
        } catch (WrongLoginException e) {
            System.out.println("Wrong login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password: " + e.getMessage());
        }
    }
}
