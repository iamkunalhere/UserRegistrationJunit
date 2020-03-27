package main.java;
import java.util.regex.Pattern;

public class UserRegistration {
    static String patternForName="^[A-Z][a-z]{2}[a-z]*$";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }
    public boolean checkName(String Name) {
        return Pattern.matches(patternForName,Name);
    }
}
