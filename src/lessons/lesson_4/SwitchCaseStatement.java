package src.lessons.lesson_4;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the order:");
        int orderNumber = input.nextInt();

        switch (orderNumber) {
            case 1:
                System.out.println("Winner");
                break;
            case 2:
                System.out.println("Runner-up");
                break;
            case 3:
                System.out.println("Second Runner-up");
                break;
            default:
                System.out.println("Special Award");
        }
    }
}
