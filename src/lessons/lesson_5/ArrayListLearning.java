package src.lessons.lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        // CRUD
        // Create
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange"));
        int size = fruits.size();
        System.out.println(fruits);
        checkFruitItem(size, fruits);

        // Add
        fruits.add("Chery");
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Grape");
        System.out.println("Fruits after adding items" + fruits);
        System.out.printf("Fruits length is: %d\n", fruits.size());

        // Read
        System.out.println("\nFruit item with for loop:");
        for (int index = 0; index < fruits.size(); index++) {
            String currentValue = fruits.get(index);
            System.out.printf("Value at index %d is: %s\n", index, currentValue);
        }

        System.out.println("\nFruit item with enhance for loop:");
        // Auto-boxing , auto-unboxing
        for (String wrapperValue : fruits) {
            System.out.println(wrapperValue);
        }

        // Update
        int indexToReplace = 2;
        String replaceValue = "Raspberry";
        fruits.set(indexToReplace, replaceValue);
        System.out.println("Updated ArrayList:\n" + fruits);

        // Delete by index
        int indexToRemove = 2; // Raspberry
        fruits.remove(indexToRemove);
        System.out.println("Fruits after removing by index:" + fruits);

        // Delete by an item object
        String itemToRemove = "Watermelon";
        fruits.remove(itemToRemove);
        System.out.println("Fruits after removing by item: " + fruits);


    }

    private static void checkFruitItem(int size, List<String> fruits) {
        // Check fruits empty
        String itemSingular = "item";
        String itemPlural = "items";
        String itemText = size == 1 ? itemSingular : itemPlural;
        String messageCheckEmpty = (fruits.isEmpty() == true) ? " Fruits is empty" : String.format("Fruits has %d %s", size, itemText);
        System.out.println(messageCheckEmpty);
    }
}
