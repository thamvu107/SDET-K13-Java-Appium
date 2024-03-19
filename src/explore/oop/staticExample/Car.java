package src.explore.oop.staticExample;

public class Car {
    private static int carCount;
    private int id;
    private String name;

    private String engine;

    public Car() {
        this.id = ++carCount;
    }

    public Car(String name, String engine) {
        this.id = ++carCount;
        this.name = name;
        this.engine = engine;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    // Static Method
    static void milesToKms() {
        System.out.println("Static method: Miles to Kms");
    }

    void calcMileage() {
        System.out.println("None static calculate Mileage of Car " + getId());
    }

    public static String getCarsInformation(Car car) {
        /*
         * static methods can’t access instance variables and instance methods directly.
         * They need some object reference to do so
         * */
        return car.getName() + "-" + car.getEngine();
    }
}
