package src.lessons.lesson_9.p03.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static src.lessons.lesson_9.p03.builder.House.HouseBuilder;

public class HouseDemo {
    /*
     * Problems: 1 & 2
     *   + 1. Object has the issue with a large number of optional parameters
     *   + 2. Immutable Object -> When create object then can not change object value.
     *   + => Only getter ( don't have setter) but must set value when initial object ( inner class)
     *
     * Solution: Builder Design Patter
     * => A Builder Pattern solves the issue with a large number of optional parameters
     * */
    public static void main(String[] args) {

        // Builder Design Pattern

        // Immutable Objects
        HouseBuilder builder = new HouseBuilder();
        House house = builder.build();

        HouseBuilder builder1 = new HouseBuilder();
        builder1.setColor("Yellow");
        builder1.setWindows(9);

        House house1 = builder1.build();

        // method chaining - Readability
        HouseBuilder builder2 = new HouseBuilder();
        House house2 = builder2
                .setColor("Green")
                .setTopRoof("Pink")
                .setWindows(8)
                .build();


        House house3 = House.builder()
                .setMainDoors(1)
                .setWindows(2)
                .setColor("Pink")
                .setTopRoof("Yellow")
                .build();
        List<House> houseList = new ArrayList<>(Arrays.asList(house, house1, house2, house3));

        printAllHouse(houseList);
    }

    private static void printAllHouse(List<House> houseList) {
        for (House house : houseList) {
            System.out.println(house.toString());
        }
    }

}
