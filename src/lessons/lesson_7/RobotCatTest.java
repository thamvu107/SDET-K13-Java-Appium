package src.lessons.lesson_7;

public class RobotCatTest {
    public static void main(String[] args) {
        // robotCat: user-defined data type
        RobotCat robotCat = new RobotCat("MeoMeo");
        System.out.println("Robot name is: " + robotCat.getName());
        robotCat.setName("Doremi");
        System.out.println("Robot name is updated: " + robotCat.getName());
        System.out.println(robotCat.toString());
    }
}
