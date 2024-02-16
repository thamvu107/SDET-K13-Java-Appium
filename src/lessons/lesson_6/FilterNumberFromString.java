package src.lessons.lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNumberFromString {
    public static void main(String[] args) {
        hasCharacterInIntArray();

        String myString = "4560007String9008010";
        System.out.println("myString: " + myString);

        char[] charArray = myString.toCharArray();
        System.out.println("charArray: " + Arrays.toString(charArray));

        // Method 1
        filterNumberInStrUseArrayList(charArray);
        // Method 2
        filterNumberInStrUseArray(myString, charArray);

    }

    private static void filterNumberInStrUseArray(String myString, char[] charArray) {
        int myStrLength = myString.length();
        int[] numberFromStr = new int[myStrLength];
        System.out.println("numberFromStr:" + Arrays.toString(numberFromStr));

        int numberFromStrIndex = 0;
        for (char character : charArray) {
            if (Character.isDigit(character)) {
                numberFromStr[numberFromStrIndex++] = Integer.parseInt(String.valueOf(character));
            }
        }
        System.out.println("numberFromStr: " + Arrays.toString(numberFromStr));

        int[] finalNumberFromStr = new int[numberFromStrIndex];
        for (int index = 0; index < numberFromStrIndex; index++) {
            finalNumberFromStr[index] = numberFromStr[index];
        }

        System.out.println("finalNumberFromStr: " + Arrays.toString(finalNumberFromStr));
    }

    private static void filterNumberInStrUseArrayList(char[] charArray) {
        List<Integer> numbers = new ArrayList<>();
        List<String> characters = new ArrayList<>();

        for (char character : charArray) {
            if (Character.isDigit(character)) {
                numbers.add(Integer.parseInt(String.valueOf(character)));
            } else if (Character.isLetter(character)) {
                characters.add(String.valueOf(character));
            }
        }
        System.out.println("Numbers:" + numbers);
        System.out.println("Characters:" + characters);
    }

    private static void hasCharacterInIntArray() {
        int[] myIntArray = {1, 2, 3, 'a'}; // ASCII - American Standard Code for Information Interchange
        System.out.println(Arrays.toString(myIntArray));
    }

}
