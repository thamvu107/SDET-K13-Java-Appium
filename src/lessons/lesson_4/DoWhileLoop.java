package src.lessons.lesson_4;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        * guess number 3 time
        * 1->10
        * if 3 time fail then print "Chuc ban may man lan sau"
        * if at least one time is correct => Hooray
        * */
        int guessingTime = 0;
        int randomNum = new SecureRandom().nextInt(10) +1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please guess and input a number:");
             int userNum = input.nextInt();
             if(userNum == randomNum){
                 System.out.println("Hooray!");
                 break;
             }
             guessingTime++;
        }
        while (guessingTime < 3);
        if(guessingTime == 3) {
            System.out.println("good luck next time.");
        }
    }
}
