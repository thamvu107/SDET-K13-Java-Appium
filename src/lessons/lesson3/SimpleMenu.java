package src.lessons.lesson3;

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
             System.out.println("BEGIN LUCKY DRAW GAME");
             System.out.println("1. Generate lucky number");
             System.out.println("0. Exit game");

             System.out.println("Please enter your option [1 or 0]:");
             Scanner input = new Scanner(System.in);
             int userOption = input.nextInt();

             if(userOption == 0 ) {
                 isContinuing = false;
             } else if (userOption == 1) {
                 final int LUCKY_NUMBER = new SecureRandom().nextInt(10) + 1;
                 System.out.printf("Lucky draw number is %d\n", LUCKY_NUMBER);
             } else {
                 System.out.println("Please enter correct option");
             }
         }
        System.out.println("See you again");
    }
}
