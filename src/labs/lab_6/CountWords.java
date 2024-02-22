package src.labs.lab_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
    /*
     * Allow user to input a sentence
     * Count the words and group them
     * Ex: Hello, tui ten teo, ban co phai ten teo khong?
     * */

    private static final String WORD_REGEX = "\\b\\w+\\b";

    public static void main(String[] args) {
        String sentence = inputSentence();
        Map<String,Integer> wordMap = groupWords(sentence);
        printWordCounts(wordMap);

    }
    private static void printWordCounts(Map<String, Integer> wordMap){
        for (String word : wordMap.keySet()) {
            System.out.printf("%s: %d\n",word, wordMap.get(word));
        }
    }

    private static Map<String, Integer> groupWords(String sentence) {
        Pattern pattern = Pattern.compile(WORD_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        Map<String, Integer> wordCounts = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }

    private static String inputSentence() {
        System.out.println("Please input a sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        return sentence;
    }
}
