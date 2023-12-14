package com.teachmeskills.lesson13.homework.solution1;

import com.teachmeskills.lesson13.homework.solution1.validation.Validator;

public class Runner {
    public static void main(String[] args) {
        String login1 = "user123";
        String password1 = "pass123";
        String confirmPassword1 = "pass123";

        String login2 = "user with spaces";
        String password2 = "password without digits";
        String confirmPassword2 = "password without digits";

        System.out.println("Login and password 1: " + Validator.validate(login1, password1, confirmPassword1)); // должно вернуть true
        System.out.println("Login and password 2: " + Validator.validate(login2, password2, confirmPassword2)); // должно вернуть false
    }
}
