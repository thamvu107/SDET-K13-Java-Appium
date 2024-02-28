package src.labs.lab_7.animal;

import java.util.Random;

public class Tiger extends Animal {
    private static final int MAX_TIGER_SPEED = 100;

    public Tiger() {
        super(AnimalTypes.TIGER, "Unnamed Tiger");
    }

    public Tiger(String name) {
        super(AnimalTypes.TIGER, name);
    }

    @Override
    public void setType(AnimalTypes type) {
        super.setType(AnimalTypes.TIGER);
    }

    @Override
    protected int randomSpeed() {
        return new Random().nextInt(MAX_TIGER_SPEED + 1);
    }
}
