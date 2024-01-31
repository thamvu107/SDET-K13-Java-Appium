package src.labs.lab_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SimpleMenuWithOptions {
    private static final int MAX_VALUE = 999;

    public static void main(String[] args) {

        List<Integer> numbers = generateArrayListNumbers(MAX_VALUE);
        printSizeOfArrayList(numbers);

        boolean isContinue = true;
        while (isContinue) {
            printMenu();
            if (numbers.isEmpty()) {
                System.out.println("ArrayList is empty");
                isContinue = false;
            } else {
                Scanner scanner = new Scanner(System.in);
                int userOption = selectMenuItem(scanner);
                switch (userOption) {
                    case 1:
                        printNumbers(numbers);
                        break;
                    case 2:
                        System.out.println("Max number is: " + findMaxNumber(numbers));
                        break;
                    case 3:
                        System.out.println("Min number is: " + findMinNumber(numbers));
                        break;
                    case 4:
                        int targetNumber = inputTargetNumber(scanner);
                        int searchResult = searchNumber(numbers, targetNumber);
                        printSearchResult(targetNumber, searchResult);
                        break;
                    default:
                        System.out.println("Exit the simple menu with options program");
                        scanner.close();
                        isContinue = false;
                }
            }
        }
    }

    private static void printSearchResult(int targetNumber, int searchResult) {
        String foundTargetNumber = String.format("%d is found at index %d", targetNumber, searchResult);
        String notFoundTargetNumber = String.format("%d is not found in arraylist", targetNumber);

        String searchMessageResult = (searchResult != -1) ? foundTargetNumber : notFoundTargetNumber;
        System.out.println(searchMessageResult);
    }

    private static int inputTargetNumber(Scanner scanner) {
        System.out.println("Please enter a target number:");
        int targetNumber = scanner.nextInt();
        return targetNumber;
    }

    private static int searchNumber(List<Integer> numbers, int targetNumber) {
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) == targetNumber) {
                return index;
            }
        }
        return -1;
    }

    private static int findMinNumber(List<Integer> numbers) {
        int minNumber = numbers.get(0);
        for (int index = 1; index < numbers.size(); index++) {
            if (minNumber > numbers.get(index))
                minNumber = numbers.get(index);
        }

        return minNumber;
    }

    private static int findMaxNumber(List<Integer> numbers) {
        int maxNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (maxNumber < number)
                maxNumber = number;
        }
        return maxNumber;
    }

    private static void printNumbers(List<Integer> numbers) {
        String message = numbers.isEmpty() ? String.format("ArrayList is empty.") : String.format("All numbers \n%s", numbers.toString());
        System.out.println(message);
    }

    private static int selectMenuItem(Scanner scanner) {
        System.out.println("Please enter a number corresponding to the menu item:");
        int menuItem = scanner.nextInt();

        if (menuItem < 1 || menuItem > 5)
            System.out.println("Invalid number for menu item.\nPlease double check the menu and enter corresponding number for menu item, Thanks!");
        return menuItem;
    }

    private static void printMenu() {
        System.out.println("\n----------MENU----------");
        String[] menuItems = {"Print all numbers", "Print maximum value", "Print minimum value", "Search number", "Exit"};
        for (int index = 0; index < menuItems.length; index++) {
            System.out.printf("%d. %s\n", index + 1, menuItems[index]);
        }
    }

    private static void printSizeOfArrayList(List<Integer> numbers) {
        int arrayListSize = numbers.size();
        System.out.println(String.format("ArrayList has %d %s", arrayListSize, arrayListSize > 1 ? "numbers" : "number"));
    }

    private static ArrayList<Integer> generateArrayListNumbers(int maxValue) {
        int maxSize = 50;
        int randomSize = new Random().nextInt(maxSize + 1);
        ArrayList<Integer> arrayList = new ArrayList<>(randomSize);
        for (int index = 0; index < randomSize; index++) {
            Random random = new Random();
            arrayList.add(random.nextInt(maxValue + 1));
        }
        return arrayList;
    }

    /*
     * Lab 4: Create a simple menu with 4 options:
     *   4.1 Generate an ArrayList with random numbers (not fixed numbers) those are less than 1000
     *   4.2 After that, have a menu (You can use while loop) to have below options
     *   =====MENU======
     *   1. Print all numbers
     *   2. Print maximum value
     *   3. Print minimum value
     *   4. Search number
     *
     *
     *   while(isContinue){
     *   print menu items with 4 options
     *       scanner inputOption = new Scanner(System.in);
     *       userOption = inputOption.NextInt();
     *   int option = inputOption.
     *   case 1: print all numbers
     *   case 2: print maximum value ->
     *           Find out the maximum number from array list
     *           print out maximum number
     *   case 3: print minimum value
     *           Find out the minimum number from array list
     *           Print out minimum number
     *   case 4: search number
     *           User inputs a number (X)
     *           if that number is existing in arraylist
     *               Then print the number & its index.
     *           Else print that number (X) is not in the list
     *   case 5: Exit while loop
     *          isContinue = false
     *   }
     * */
}
