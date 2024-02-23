package src.labs.lab_6;

import java.util.HashMap;
import java.util.LinkedHashMap;
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

    private static final String WORD_REGEX = "\\p{L}+";

    public static void main(String[] args) {
        String mySentence ="Tui tên là Thắm, xin chào bạn, tên của bạn là gì";

        System.out.println("Group & count words in sentence:\n" + mySentence);
        printWordCounts(groupWords(mySentence));

        String inputSentence = inputSentence();
        Map<String,Integer> wordsMap = groupWords(inputSentence);
        System.out.println("Group & count words in sentence:\n" + inputSentence);
        printWordCounts(wordsMap);



    }
    private static void printWordCounts(Map<String, Integer> wordMap){
        for (String word : wordMap.keySet()) {
            System.out.printf("%s: %d\n",word, wordMap.get(word));
        }
    }

    private static Map<String, Integer> groupWords(String sentence) {
        Pattern pattern = Pattern.compile(WORD_REGEX, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(sentence);

        Map<String, Integer> wordCounts = new LinkedHashMap<>();
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
