package src.lessons.lesson_4;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        System.out.println("Please input the order:");
        Scanner input = new Scanner(System.in);
        int orderNumber = input.nextInt();

        printOderPrize(orderNumber);
    }

    private static void printOderPrize(int orderNumber) {
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
