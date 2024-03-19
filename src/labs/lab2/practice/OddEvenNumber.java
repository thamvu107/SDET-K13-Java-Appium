package src.labs.lab2.practice;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check an odd or even number:");
        float number = input.nextFloat();
        input.close();

        String message = number % 2 == 0 ? "This is even number" : "This is odd number";
        System.out.println(message);
    }
}
