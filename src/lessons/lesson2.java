package src.lessons;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        // Left operand and right operand
        int total = myNum1 + myNum2;
        System.out.println("Total: " + total);

        // Print with format: %d, %f, %b, %s
        System.out.printf("Total: %d", total);

        int a = 1;
        int b = 2;
        int c = ++a + b++;

        // Prefix > right operand > assign value for left operand ? postfix
        // a = 2; b= 3; c =4;
        System.out.printf("\na = %d, b = %d, c = %d\n", a, b, c);

        // Comparison Operators: ==, !=, > , < , >=, <=
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arrival time: ");
        int arrivalTime = scanner.nextInt();

        final int EXPECTED_TIME = 7;
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;
        String message = isHeOnTime ? "Let's talk" : "Write a letter";

        System.out.println("Step 1.");
        System.out.println("Step 2.");
        System.out.printf("Step 3. %s\n", message);
        System.out.println("Step 4.");
        System.out.println("Step 5.");

    }
}
