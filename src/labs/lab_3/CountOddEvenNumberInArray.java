package src.labs.lab_3;

import java.util.Arrays;
import java.util.Random;

public class CountOddEvenNumberInArray {
    public static void main(String[] args) {
        // 1. Generate a random integer number array
        int arrayLength = 2;
        int maxValue = 100;
        int[] numberArray = generateRandomNumberArray(arrayLength, maxValue);

        int evenCount = 0;
        for (int number : numberArray) {
            if (number % 2 == 0)
                evenCount++;
        }

        System.out.println(Arrays.toString(numberArray));

        int oddCount = numberArray.length - evenCount;

        String result = getResult(evenCount, oddCount);

        System.out.println(result);
    }

    private static String getResult(int evenCount, int oddCount) {
        String singularText = "number";
        String pluralText = "numbers";

        String foundEvenNumberMsg = String.format("There are %d even %s in the array.", evenCount, evenCount > 1 ? pluralText : singularText);
        String foundOddNumberMsg = String.format("There are %d odd %s in the array.", oddCount, oddCount > 1 ? pluralText : singularText);

        String evenNumberResult = evenCount > 0 ? foundEvenNumberMsg : "There are no even number in the array.";
        String oddNumberResult = oddCount > 0 ? foundOddNumberMsg : "There are no odd number in the array.";

        String result = String.format("%s\n%s", evenNumberResult, oddNumberResult);

        return result;
    }

    private static int[] generateRandomNumberArray(int arrayLength, int maxValue) {
        int[] randomNumberArray = new int[arrayLength];
        Random random = new Random();

        for (int index = 0; index < arrayLength; index++) {
            randomNumberArray[index] = random.nextInt(maxValue);
        }
        return randomNumberArray;
    }

    /*
    // Problems:
    Count how many odd, even number(s) in an integer number array
    int[] intArr = {1, 2, 3, 4, 5};
    Even numbers: 2
    Odd numbers: 3

    // Understand & break small problems:
        1. has an integer array => Generate a random integer array
        2. count even, odd
            loop array value.
                if element value %2 == 0 then countEven++;
            countOdd = array length - countEvent;

        3. print out count even/ odd numbers result
            count = 0 => not found
            count = 1 even/odd => number
            count > 1 even/odd => numbers
    */
}
