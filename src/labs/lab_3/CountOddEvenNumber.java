package src.labs.lab_3;

import java.util.Arrays;

public class CountOddEvenNumber {
    public static void main(String[] args) {

        // 1. Generate random integer number array
        int[] intArray = Helper.generateIntNumberArray(10, 100);
        System.out.println(Arrays.toString(intArray));
        countEvenOddNumber(intArray);
        System.out.println();

        int[] intArray1 = {1};
        System.out.println(Arrays.toString(intArray1));
        countEvenOddNumber(intArray1);
        System.out.println();
    }

    private static void countEvenOddNumber(int[] numberArray) {
        if(numberArray.length == 0){
            System.out.println("This is an empty array");
            return;
        }

        // 2. Count even, odd number
        int evenCount = 0, oddCount = 0;
        for (int number : numberArray) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 3. Print result:
        String result = displayCountingMsg(evenCount, oddCount);
        System.out.println(result);
    }

    private static String displayCountingMsg(int evenCount, int oddCount) {
        String singularText = "number";
        String pluralText = "numbers";

        String foundEvenNumberMsg = String.format("There are %d even %s in the array.", evenCount, evenCount > 1 ? pluralText : singularText);
        String foundOddNumberMsg = String.format("There are %d odd %s in the array.", oddCount, oddCount > 1 ? pluralText : singularText);

        String evenNumberResult = evenCount > 0 ? foundEvenNumberMsg : "There are no even number in the array.";
        String oddNumberResult = oddCount > 0 ? foundOddNumberMsg : "There are no odd number in the array.";

        String result = String.format("%s\n%s", evenNumberResult, oddNumberResult);

        return result;
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
