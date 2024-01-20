package src.labs.lab_3;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = Helper.generateIntNumberArray(5, 100);
        System.out.printf("Before sorting array: %s\n", Arrays.toString(numbers));
        Helper.sortAscending(numbers);
        System.out.printf("After sorting array: %s", Arrays.toString(numbers));
    }
}
