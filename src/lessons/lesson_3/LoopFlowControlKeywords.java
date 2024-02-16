package src.lessons.lesson_3;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LoopFlowControlKeywords {
    public static void main(String[] args) {
        /*
         * Problem:
         * Given an array of random integer numbers in range of 100 with 10 elements.
         * Print out the first index of the target number.
         * Allow user to input the target number
         * */

        final int ARRAY_LENGTH = 10;
        final int MAX_VALUE = 10;
        int[] myArray = new int[ARRAY_LENGTH];

        for (int index = 0; index < ARRAY_LENGTH; index++) {
            int randomValue = new SecureRandom().nextInt(MAX_VALUE + 1);
            myArray[index] = randomValue;
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("Please enter your target number: ");
        Scanner input = new Scanner(System.in);
        int targetNumber = input.nextInt();
        boolean found = false;

        /*
         * loop over the array
         *   if element == targetNumber
         *       printout the index
         *       exit the loop
         * */

        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] == targetNumber) {
                found = true;
                System.out.printf(String.format("The number %d is found at the index %d", targetNumber, index));
                break;
            }
        }

        if (!found) {
            System.out.printf(String.format("The number %d is not found", targetNumber));
        }
    }
}
