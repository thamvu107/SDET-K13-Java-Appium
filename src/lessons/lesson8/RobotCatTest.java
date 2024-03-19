package src.lessons.lesson8;

import java.util.Arrays;
import java.util.List;

public class RobotCatTest {
//        Model-View-Controller Architecture
    public static void main(String[] args) {
//        Model-View-Controller Architecture

//        RobotCat batteryRobotCat = new BatteryRobotCat();
//        batteryRobotCat.setName("BatteryRobotCat");
//        System.out.println(batteryRobotCat.charge());
//
//        RobotCat solarRobotCat = new SolarRobotCat();
//        batteryRobotCat.setName("SolarRobotCat");
//        System.out.println(solarRobotCat.charge());

        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();
        solarRobotCat.introduce(); // SolarRobotCat -> RobotCat-> Machine -> Object

        List<RobotCat> robotCatList = Arrays.asList(batteryRobotCat, solarRobotCat);
        RobotCatController.chargeRobots(robotCatList);
    }
}
