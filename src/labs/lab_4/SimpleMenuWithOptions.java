package src.labs.lab_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SimpleMenuWithOptions {
    private static final int MAX_VALUE = 1000;
    private static final int ITEMS = 10;

    public static void main(String[] args) {

        List<Integer> numbers = generateArrayListNumbers(ITEMS, MAX_VALUE);
        boolean isContinue = true;
        while (isContinue) {
            printMenu();
            int userOption = selectMenuItem();
            switch (userOption) {
                case 1:
                    printNumbers(numbers);
                    break;
                case 2:
                    int maxNumber = findMaxNumber(numbers);
                    System.out.println("Max number is: " + maxNumber);
                    break;
                case 3:
                    int minNumber = findMinNumber(numbers);
                    System.out.println("Min number is: " + minNumber);
                    break;
                case 4:
                    int targetNumber = inputTargetNumber();
                    int searchResult = searchNumber(numbers, targetNumber);
                    String searchMessage = (searchResult != -1) ? String.format("%d is found at index %d", targetNumber, searchResult) : String.format("%d is not found in arraylist", targetNumber);
                    System.out.println(searchMessage);
                    break;
                default:
//                    exit(isContinue);
                    isContinue = false;
            }

        }
    }

    private static boolean exit(boolean isContinue) {
        isContinue = false;
        return isContinue;
    }

    private static int inputTargetNumber() {
        System.out.println("Please enter a target number:");
        Scanner scanner = new Scanner(System.in);
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
        /*
         * case 2: print maximum value ->
         *           Find out the maximum number from array list
         *           print out maximum number
         * */
        int maxNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (maxNumber < number)
                maxNumber = number;
        }
        return maxNumber;
    }

    private static void printNumbers(List<Integer> numbers) {
        System.out.println(numbers.toString());

    }

    private static int selectMenuItem() {
        System.out.println("Please enter a number corresponding to the menu item:");
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        if (menuItem < 1 || menuItem > 5)
            System.out.println("Invalid number. Please views the menu items and enter corresponding number, Thanks!");
        return menuItem;
    }

    private static void printMenu() {
        System.out.println("MENU");
        String[] menuItems = {"Print all numbers", "Print maximum value", "Print minimum value", "Search number", "Exit"};
        for (int index = 0; index < menuItems.length; index++) {
            System.out.printf("%d. %s\n", index + 1, menuItems[index]);
        }
    }

    private static ArrayList<Integer> generateArrayListNumbers(int items, int maxValue) {
        ArrayList<Integer> arrayList = new ArrayList<>(items);
        for (int index = 0; index < items; index++) {
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
