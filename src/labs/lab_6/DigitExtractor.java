package src.labs.lab_6;

import java.util.ArrayList;
import java.util.List;

public class DigitExtractor {
    public static void main(String[] args) {
      /*
        String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345nabc678" -> "12345678"
      */

//        String myStr = "100 minutes";
        String myStr = "12345Character678";
        System.out.println("My String: " + myStr);

        String digits = extractDigits(myStr);
        System.out.println("Digits: "+ digits);
    }

    private static String extractDigits(String myStr) {
        String extractDigits = new String();

        for (char character : myStr.toCharArray()){
            if(Character.isDigit(character)) {
                extractDigits += character;
            }
        }
        return extractDigits;
    }
}
