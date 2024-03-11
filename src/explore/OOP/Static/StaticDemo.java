package src.explore.OOP.Static;

public class StaticDemo {
    /* Rule:
     * + Static methods can be called directly using the class names.
     *        Memory for static methods is allocated in the static segment.
     *
     * There are two main restrictions for the static method:
     * + The static method can not use non static data member or call non-static method directly.
     * + this and super cannot be used in static context.
     * */
    public  int noneStatic = 30;

    public static void main(String[] args) {

        // Static method
        Car.milesToKms();
        Human.avgHeartBeat();

        // None static method
        Car myCar = new Car();
        myCar.calcMileage();

        Car yourCar = new Car();
        yourCar.calcMileage();

        Human human =  new Human();
        human.bodyTemp();
    }

}
