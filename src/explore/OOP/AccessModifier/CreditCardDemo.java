package src.explore.OOP.AccessModifier;

public class CreditCardDemo {
    public static void main(String[] args) {
        System.out.println("Hacker views credit card details");
        Hacker hacker = new Hacker();
        hacker.viewDetail();
        System.out.println("Hacker changes credit card details");
        hacker.changeDetail();
        hacker.viewDetail();
    }
}
