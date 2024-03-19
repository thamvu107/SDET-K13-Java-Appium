package src.lessons.lesson3;

public class ForLooping {

    public static void main(String[] args) {
        /*
     find index of value in array
    Ex:
     array1 ={ 8,2,9,4,5,6,7,8}
     array2 ={ 1,2,3,4,5,6,7,8}
    index of value 6;
    */
        int[] array1 = {8, 2, 9, 4, 5, 6, 7, 8};
        int number = 6;
        int index = findIndex(array1, number);
        System.out.println(array1);
        System.out.printf("index of %d is %d", number, index);
    }

    private static int findIndex(int[] array1, int number) {
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] == number)
                return index;
        }
        return -1;
    }
}
