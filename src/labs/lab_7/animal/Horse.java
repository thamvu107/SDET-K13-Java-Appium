package src.labs.lab_7.animal;

import java.util.Random;

public class Horse extends Animal {

    private static final int MAX_HORSE_SPEED = 75;

    public Horse() {
        super(AnimalTypes.HORSE, "Unnamed Horse");
    }

    public Horse(String name) {
        super(AnimalTypes.HORSE, name);
    }

    @Override
    public void setType(AnimalTypes type) {
        super.setType(AnimalTypes.HORSE);
    }

    @Override
    protected int randomSpeed() {
        return new Random().nextInt(MAX_HORSE_SPEED + 1);
    }
}
