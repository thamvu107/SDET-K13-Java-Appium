package src.lessons.lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ReplaceBadWordFromString {
    public static void main(String[] args) {


        // Replace word
        System.out.println("\n----------------------------Replace----------------------------");
        String originalStr = "Hello Wold Javascript!";
        String target = "Javascript";
        String replacement = "Java";
        String processed = originalStr.replace(target, replacement);
        System.out.println("originalStr: " + originalStr);
        System.out.println("processed: " + processed);
        System.out.println("originalStr: " + originalStr); // immutable - original myString is NOT changed


        // Replace words
        String myString = "   You're stupid. I hate you because you are so mad.     ";

        List<String> badWords = new ArrayList<String>();
        badWords.add("stupid");
        badWords.add("hate");
        badWords.add("mad");
        String replaceBadWords = myString;

        for (String badWord : badWords) {
            if (myString.toLowerCase().contains(badWord)) {
                replaceBadWords = replaceBadWords.replace(badWord, "***");
            }
        }
        System.out.println("\nOriginal myString: " + myString);
        System.out.println("replaceBadWords: " + replaceBadWords.trim());

    }
}
