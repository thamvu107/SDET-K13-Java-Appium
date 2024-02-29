package src.lessons.lesson_9.P02_DataModel;

public class HouseDemo {
    /*
     * Problem:
     * + 1. When Object has the issue with a large number of optional parameters
     *  Note:  use Overloading -> Hard to use -> is not good practice in this case.
     *
     * Solution 1: Create data model
     * */
    public static void main(String[] args) {
        // Create Data model
        House house = new House();
        house.setColor("Pink");
        house.setWinDows(2);
    }
}
