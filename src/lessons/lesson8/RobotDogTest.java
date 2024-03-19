package src.lessons.lesson8;

public class RobotDogTest {
    public static void main(String[] args) {
        RobotDog dog1 = new RobotDog();
        RobotDog dog2 = new RobotDog();
        System.out.println("dog1.getDogId(): " + dog1.getDogId());
        System.out.println("dog2.getDogId(): " +dog2.getDogId());

        RobotDog.doSth();
        System.out.println("RobotDog.dogId: " +RobotDog.dogId);
        System.out.println("dog1.dogId: " +dog1.dogId);

        RobotDog batteryRobotDog = new BatteryRobotDog();
        System.out.println("dog1.getDogId() " + dog1.getDogId());
    }
}
