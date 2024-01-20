package src.labs.lab_3;

import java.util.Random;

public class Helper {
    public static int[] generateIntNumberArray(int arrayLength, int maxValue) {
        int[] randomNumberArray = new int[arrayLength];
        Random random = new Random();

        for (int index = 0; index < arrayLength; index++) {
            randomNumberArray[index] = random.nextInt(maxValue);
        }
        return randomNumberArray;
    }

    public static void sortAscending(int[] numbers) {
        boolean isSorted;
        for (int i = 0; i < numbers.length; i++) {
            isSorted = true;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
