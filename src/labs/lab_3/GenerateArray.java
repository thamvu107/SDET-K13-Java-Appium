package src.labs.lab_3;

import java.util.Random;

public class GenerateArray {
    public static int[] intNumberArray(int arrayLength, int maxValue) {
        int[] randomNumberArray = new int[arrayLength];
        Random random = new Random();

        for (int index = 0; index < arrayLength; index++) {
            randomNumberArray[index] = random.nextInt(maxValue);
        }
        return randomNumberArray;
    }
}
