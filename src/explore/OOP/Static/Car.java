package src.explore.OOP.Static;

public class Car {
    private static int carCount;
    private int id;

    public Car() {
        this.id = ++carCount;
    }

    public int getId() {

        return id;
    }

    // Static Method
    static void milesToKms() {
        System.out.println("Static method: Miles to Kms");
    }

    void calcMileage() {
        System.out.println("None static calculate Mileage of Car " + getId());
    }
}
