package src.lessons.lesson5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        // CRUD
        // Create
        List<String> fruits = new ArrayList<>();
        // List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange"));

        displayFruitListStatus(fruits.size(), fruits);
        System.out.println(fruits);

        // Add
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.printf("Fruits has %d items: %s\n", fruits.size(), String.join(", ", fruits));

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
        System.out.println("\nUpdated ArrayList:\n" + fruits);

        // Delete by index
        int indexToRemove = 2; // Raspberry
        fruits.remove(indexToRemove);
        System.out.println("Fruits after removing by index:" + fruits);

        // Delete by an item object
        String itemToRemove = "Watermelon";
        fruits.remove(itemToRemove);
        System.out.println("Fruits after removing by item: " + fruits);

    }

    private static void displayFruitListStatus(int size, List<String> fruits) {
        // Check fruits empty
        String itemSingular = "item";
        String itemPlural = "items";
        String itemText = size == 1 ? itemSingular : itemPlural;
        String messageCheckEmpty = (fruits.isEmpty()) ? " Fruits is empty" : String.format("Fruits has %d %s", size, itemText);
        System.out.println(messageCheckEmpty);
    }
}
