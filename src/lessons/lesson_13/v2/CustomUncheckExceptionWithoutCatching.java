package src.lessons.lesson_13.v2;

import src.lessons.lesson_13.v4.DivideByZeroUncheckedException;

public class CustomUncheckExceptionWithoutCatching {
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            //custom exception
            throw new DivideByZeroUncheckedException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        try {
            // Unchecked Exception
            int result = CustomUncheckExceptionWithoutCatching.divide(3, 0);
            System.out.println("Result: " + result);
        }/*
        catch (DivideByZeroUncheckedException e) {
            e.printStackTrace();
        }*/
        finally {
            System.out.println("Cleanup data");
        }
        // it will throw an exception and not run this line
        System.out.println("Continuing processing after exception handling");
    }
}
