package main.java;
import java.util.regex.Pattern;

public class UserRegistration {
    static String patternForName="^[A-Z][a-z]{2}[a-z]*$";
    static String patternForEmail="^[a-z][a-z0-9]*[.+-]?[a-z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]{2,3}([.]{1}[a-z]{2,3})?$";
    static String patternForNumber="^[0-9]{2}[ ][0-9]{10}";
    static String patternForPassword="[a-zA-Z0-9!@#$%^&*]{8,}";
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }
    public boolean checkName(String Name) {
        return Pattern.matches(patternForName,Name);
    }
    public boolean checkEmail(String Email) {
        return Pattern.matches(patternForEmail,Email);
    }
    public boolean checkMobileNumber(String Number) {
        return Pattern.matches(patternForNumber,Number);
    }
    public boolean checkPasswordLength(String Password) {
        return Pattern.matches(patternForPassword,Password);
    }
}
