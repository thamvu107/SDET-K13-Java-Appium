package src.lessons.Lesson_12.interfaceExample;

import java.util.List;

public class RaceController {

    public static IRaceAble getWinner(List<IRaceAble> raceGroup) {
        // TODO : check the valid of data
        IRaceAble winner = raceGroup.get(0);
        for (IRaceAble raceMember : raceGroup) {
            if (raceMember.speed() > winner.speed()) {
                winner = raceMember;
            }
        }

        return winner;
    }

    /**
     * Program base on interface not details implementation
     * */
}
