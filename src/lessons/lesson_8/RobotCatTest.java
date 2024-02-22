package src.lessons.lesson_8;

import java.util.Arrays;
import java.util.List;

public class RobotCatTest {
    public static void main(String[] args) {
//        RobotCat batteryRobotCat = new BatteryRobotCat();
//        batteryRobotCat.setName("BatteryRobotCat");
//        System.out.println(batteryRobotCat.charge());
//
//        RobotCat solarRobotCat = new SolarRobotCat();
//        batteryRobotCat.setName("SolarRobotCat");
//        System.out.println(solarRobotCat.charge());

        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();
        solarRobotCat.introduce();

        List<RobotCat> robotCatList = Arrays.asList(batteryRobotCat, solarRobotCat);
        RobotCatController.chargeRobots(robotCatList);
    }
}
