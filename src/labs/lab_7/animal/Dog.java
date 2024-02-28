package src.labs.lab_7.animal;

import java.util.Random;

public class Dog extends Animal {
    private static final int MAX_DOG_SPEED = 60;

    public Dog() {
        super(AnimalTypes.DOG, "Unnamed Dog");
    }

    public Dog(String name) {
        super(AnimalTypes.DOG, name);
    }

    @Override
    public void setType(AnimalTypes type) {
        super.setType(AnimalTypes.DOG);
    }

    @Override
    protected int randomSpeed() {
        return new Random().nextInt(MAX_DOG_SPEED + 1);
    }
}
