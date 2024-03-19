package src.labs.lab3.practice;

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
        for (int firstIndex = 0; firstIndex < numbers.length; firstIndex++) {
            isSorted = true;
            for (int secondIndex = 0; secondIndex < numbers.length - firstIndex - 1; secondIndex++) {
                if (numbers[secondIndex] > numbers[secondIndex + 1]) {
                    swap(numbers, secondIndex, secondIndex + 1);
                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }
    public static void swap1(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void swap(int[] array, int index1, int index2){
        array[index1] = array[index1] + array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] = array[index1] - array[index2];
    }
}
