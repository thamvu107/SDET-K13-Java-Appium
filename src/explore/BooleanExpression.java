package src.explore;

import java.util.Scanner;

public class BooleanExpression {
    public static void main(String[] args) {

        requiresRefund();

    }

    private static void requiresRefund() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the item in stock? (true/false)");
        boolean inStock = scanner.nextBoolean();

        System.out.println("Has the user paid?");
        boolean hasPaid = scanner.nextBoolean();

        boolean requiresRefund = hasPaid && !inStock;

        if (requiresRefund) {
            System.out.println("Refund is required");
        } else {
            System.out.println("No refund is required");
        }

        scanner.close();
    }

}
