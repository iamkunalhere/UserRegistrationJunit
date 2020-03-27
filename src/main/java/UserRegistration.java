package main.java;

import java.util.regex.Pattern;

public class UserRegistration {

    static String patternForName="^[A-Z][a-z]{2}[a-z]*$";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }
    public boolean checkName(String firstName) {
        return Pattern.matches(patternForName,firstName);
    }
}
