package src.labs.lab_7.animal;

public class Dog extends Animal{
    private static final int MAX_DOG_SPEED = 60;

    public Dog(String name) {
        super(name);
    }

    @Override
    protected int updateSpeed() {
        return randomSpeed(MAX_DOG_SPEED);
    }
}
