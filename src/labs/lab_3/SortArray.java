package src.labs.lab_3;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = GenerateArray.intNumberArray(5, 100);
        System.out.printf("Before sorting array: %s\n", Arrays.toString(numbers));
        sort(numbers);
        System.out.printf("After sorting array: %s", Arrays.toString(numbers));
    }

    private static void sort(int[] numbers) {
        boolean isSorted;
        for (int i = 0; i < numbers.length; i++) {
            isSorted = true;
            for (int j = 1; j < numbers.length-i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j - 1);
                    isSorted = false;
                }
            }
            if(isSorted)
                return;
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
