package src.lessons.Lesson12.interfaceExample;

import java.util.Arrays;

public class RacingDemo {
    /**
     * HAS-A relationship --> Irrelevant classes
     * Controller(s): HAS-A relationship processing flyable, raceAble, ... ( able has multi Controllers)
     * Interface is Default public & abstract
     * Program base on interface not details implementation
     * */
    public static void main(String[] args) {
        Animal bong = new Animal();
        Human ti = new Human();

        IRaceAble winner = RaceController.getWinner(Arrays.asList(bong, ti));
        System.out.println(winner);
    }
}
