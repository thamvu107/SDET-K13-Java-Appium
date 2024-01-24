package src.lessons.lesson_5;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(Arrays.asList("Apple", "Orange"));

        // Add
        myList.add("Chery");
        myList.add("Chery");
        myList.add("Watermelon");

        // contain
        System.out.println(myList.contains("Chery"));
        List<String> uniqueList = new ArrayList<>();
        for (String value: myList) {
            if (!uniqueList.contains(value)){
                uniqueList.add(value);
            }
        }
        System.out.println(uniqueList);
        System.out.println(myList);

        // Using Set to remove duplication
        Set<String> mySet = new HashSet<>(myList);
        List<String> listFromSet = new ArrayList<>(mySet);
        System.out.println(mySet);

    }
}
