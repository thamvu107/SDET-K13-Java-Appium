package src.labs.lab_7.animal;

public class Tiger extends Animal {
    private static final int MAX_TIGER_SPEED = 100;

    public Tiger(String name) {
        super(name);
    }

    @Override
    protected int updateSpeed() {
        return randomSpeed(MAX_TIGER_SPEED);
    }
}
