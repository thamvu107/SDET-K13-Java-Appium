package src.lessons.Lesson_12;

import java.util.Arrays;

public class RacingDemo {
    public static void main(String[] args) {
        Animal bong = new Animal();
        Human ti = new Human();

        IRaceAble winner = RaceController.getWinner(Arrays.asList(bong, ti));
        System.out.println(winner.toString());
    }
}
