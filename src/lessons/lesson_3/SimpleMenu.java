package src.lessons.lesson_3;

import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        /*
         * Problem: Lucky draw game
         * 1. Generate lucky number
         * 0. Exit!
         *
         * */
        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            int userOption = getUserOption();

            if (userOption == 0) {
                isContinuing = false;
            } else if (userOption == 1) {
                getLuckyNumber();
            } else {
                System.out.println("Please enter correct option");
            }
        }
        System.out.println("See you again");
    }

    private static void getLuckyNumber() {
        final int LUCKY_NUMBER = new SecureRandom().nextInt(10) + 1;
        System.out.printf("Lucky draw number is %d\n", LUCKY_NUMBER);
    }

    private static int getUserOption() {
        System.out.println("Please enter your option [1 or 0]:");
        Scanner input = new Scanner(System.in);
        int userOption = input.nextInt();
        return userOption;
    }

    private static void printMenu() {
        System.out.println("BEGIN LUCKY DRAW GAME");
        System.out.println("1. Generate lucky number");
        System.out.println("0. Exit game");
    }

}
