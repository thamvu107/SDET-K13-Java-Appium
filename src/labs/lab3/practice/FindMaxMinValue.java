package src.labs.lab3.practice;

import java.util.Arrays;

public class FindMaxMinValue {
    /*
  Finding maximum value/minimum value from an integer array
   int[] intArr = {1, 2, 3, 4, 5};
   */
    public static void main(String[] args) {
        // 1. has an integer array
        int[] intArray = Helper.generateIntNumberArray(10, 100);
        System.out.println(Arrays.toString(intArray));

        // 2. find min, max
        int min = intArray[0];
        int max = intArray[0];
        for (int index = 1; index < intArray.length; index++) {
            if (intArray[index] < min)
                min = intArray[index];
            if (intArray[index] > max)
                max = intArray[index];
        }
        System.out.printf("Max number is %d\n", max);
        System.out.printf("Min number is %d", min);
    }
}
