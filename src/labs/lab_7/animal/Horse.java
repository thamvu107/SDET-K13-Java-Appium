package src.labs.lab_7.animal;

public class Horse extends Animal{

    public static final int MAX_HORSE_SPEED = 75;

    @Override
    protected int updateSpeed() {
        return randomSpeed(MAX_HORSE_SPEED);
    }
}
