package src.labs.lab_3;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
       /*
       Merge 2 SORTED integer array into one SORTED array

        Array 01: {9, 11, 25, 35}
        Array 02: {1, 13, 16, 27, 99}

        Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}

        problems:
        1. has 2 sorted arrays
        Then
            generate 2 arrays
            sort 2 arrays
        2. merge 2 arrays
            init merge array with length = array1 length + array2 length
            for loop array 1
        3. sort the merged array
        */

        // 1. has 2 sorted arrays

        int[] arr1 = Helper.generateIntNumberArray(3, 90);
        int[] arr2 = Helper.generateIntNumberArray(6, 100);

        Helper.sortAscending(arr1);
        Helper.sortAscending(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //  2. merge 2 arrays
        int[] arr3 = mergedSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }

    private static int[] mergedSortedArray(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];
        int i = 0, j = 0, k = 0;
        // arr1: {9, 11}
        // arr2: {1, 13, 16, 45}
        while (i < length1 || j < length2) {
            if (i < length1 && (j >= length2 || arr1[i] <= arr2[j])) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        return mergedArray;
    }
}
