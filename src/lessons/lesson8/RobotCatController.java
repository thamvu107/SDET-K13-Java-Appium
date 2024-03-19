package src.lessons.lesson8;

import java.util.List;

public class RobotCatController {
    // IS-A relationship processing
    // BatteryRobotCat IS-A RobotCat -> charge
    // SolarRobotCat IS-A RobotCat -> charge
    // HydroRobotCat IS-A RobotCat -> charge
    // NOTE: Setting - Plugin - UML to view Diagram
    public static void chargeRobots(List<RobotCat> robotCatList){
        for (RobotCat robotCat: robotCatList){
            System.out.println(robotCat.charge());
        }

    }
}
