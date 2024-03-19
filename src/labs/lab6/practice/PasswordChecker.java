package src.labs.lab6.practice;

import java.util.Scanner;

public class PasswordChecker {
        /*
        userPassword = "password@123!";
        Allow user to input maximum 3 times
        maxAttempts = 3;
        attemps = 0;
        scanner
        do
            allow user enter password
            if input password equal correct password
              print out a text Login successful
              break;
            else
                attempts++;
                remainingAttempts = maxAttempts - attempts;
                print out a text Incorrect password + remaining attempts: ;
        while attemps < maxAttempts
        close scanner
        */

    public static void main(String[] args) {
        String userPassword = "password@123!";
        int maxAttempts = 3;

        checkPassword(userPassword, maxAttempts);
    }

    private static void checkPassword(String userPassword, int maxAttempts) {
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter password: ");
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(userPassword)) {
                System.out.println("Login successful!");
                break;
            }
            else {
                attempts++;
                int remainingAttempts = maxAttempts - attempts;
                System.out.println("Incorrect password. Remaining attempts: " + remainingAttempts);
            }

        } while (attempts < maxAttempts);

        scanner.close();
    }
}
