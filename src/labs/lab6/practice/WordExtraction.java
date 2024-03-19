package src.labs.lab6.practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordExtraction {
    /*
     * Allow user to input a sentence
     * Count the words and group them
     * Ex: Hello, tui ten teo, ban co phai ten teo khong?
     * */

    private static final String EXTRACT_WORD_PATTERN = "\\b[\\p{L}']+\\b";

    public static void main(String[] args) {
        String viText = "Tui tên Tí, Tí chào BẠN. Tên bạn là gì?";
        System.out.printf("Sentence: \"%s\"\n", viText);
        printWordCounts(groupWords(viText));

        String enText = "My name's Ti, Nice to meet you. What's your name? I haven't seen you in ages. This's John's car.";
        System.out.printf("\nSentence: \"%s\"\n", enText);
        printWordCounts(groupWords(enText));

        String inputText = inputSentence();
        Map<String, Integer> wordsMap = groupWords(inputText);
        System.out.printf("\nSentence: \"%s\"\n", inputText);

        printWordCounts(wordsMap);
    }

    private static void printWordCounts(Map<String, Integer> wordMap) {
        for (String word : wordMap.keySet()) {
            System.out.printf("%s: %d\n", word, wordMap.get(word));
        }
    }

    private static Map<String, Integer> groupWords(String sentence) {
        Pattern regex = Pattern.compile(EXTRACT_WORD_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(sentence);

        Map<String, Integer> wordCounts = new LinkedHashMap<>();
        while (matcher.find()) {
            String wordLowCase = matcher.group().toLowerCase();
            wordCounts.put(wordLowCase, wordCounts.getOrDefault(wordLowCase, 0) + 1);
        }

        return wordCounts;
    }

    private static String inputSentence() {
        System.out.println("\nPlease input a sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        return sentence;
    }
}
