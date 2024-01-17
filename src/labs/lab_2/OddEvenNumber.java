package src.labs.lab_2;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        /* Problem: // Allow user to input a number, print out it’s an odd or even number
        input a number.
        number % 2 == 0 => even number else odd number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check an odd or even number:");
        float number = input.nextFloat();
        input.close();

        String message = number % 2 == 0 ? "This is even number" : "This is odd number";
        System.out.println(message);
    }
}
