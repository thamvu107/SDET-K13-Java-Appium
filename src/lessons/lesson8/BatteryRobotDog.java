package src.lessons.lesson8;

public class BatteryRobotDog extends RobotDog {
    // static block | BAD design
    static {
        dogId = 10;
    }

    public static void doAnotherSth(){
        System.out.println("Do another battery robotDog");
    }
}
