package src.explore.oop.AccessModifier;

public class Hacker extends CreditCard {
    public void viewDetail() {
        System.out.println(cardNo);
        System.out.println(pin);
    }

    public void changeDetail() {
        cardNo = 67890;
        pin = 9999;
    }
}
