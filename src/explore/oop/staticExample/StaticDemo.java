package src.explore.oop.staticExample;

public class StaticDemo {
    /* :
     * + Static methods is called directly using the class names.
     * + Static methods can’t be overridden.
     * + Abstract methods can’t be static.
     * + this and super cannot be used in static context.
     * + static methods can’t access instance variables and instance methods directly. They need some object reference to do so.
     *
     * */
    public int noneStatic = 30;

    public static void main(String[] args) {

//     Static methods is called directly using the class names.
        Car.milesToKms();
        Human.avgHeartBeat();

        // None static method
        Car myCar = new Car();
        myCar.calcMileage();

        Car yourCar = new Car();
        yourCar.calcMileage();

        Human human = new Human();
        human.bodyTemp();
    }

}
