package src.lessons.lesson_4;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * guess number 3 time
         * 1->10
         * if 3 time fail then print "Better luck next time!"
         * if at least one time is correct => Hooray
         * */

        int guessingTime = 0;
        int randomNum = new SecureRandom().nextInt(10) + 1;
        do {
            System.out.println("Please guess and input a number:");
            int userNum = enterAnIntNumber();
            if (userNum == randomNum) {
                System.out.println("Hooray!");
                break;
            }
            guessingTime++;
        }
        while (guessingTime < 3);

        if (guessingTime == 3) {
            System.out.println("Better luck next time!");
            System.out.printf("Lucky number is: %d\n", randomNum);
        }
    }

    // TODO move to Util file
    private static int enterAnIntNumber() {
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        return userNum;
    }
}
