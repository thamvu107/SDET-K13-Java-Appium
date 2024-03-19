package src.lessons.lesson7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<RobotCat> robotCatList = new ArrayList<>();

        RobotCat meomeo = new RobotCat("MeoMeo");
        RobotCat doremon = new RobotCat("Doremon");
        RobotCat doremi = new RobotCat("Doremi");
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);
        robotCatList.add(meomeo);

        robotCatList.add(doremon);
        robotCatList.add(doremi);

        robotCatList.add(meomeo);


        // change the second's meomeo's name
        final int  SECOND_MEOMEO_INDEX = 1;
        robotCatList.get(SECOND_MEOMEO_INDEX).setName("MiMi");
        System.out.println(robotCatList);

    }
}
