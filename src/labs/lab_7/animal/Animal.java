package src.labs.lab_7.animal;

import java.security.SecureRandom;

public class Animal {
    public static final int MAX_RANDOM_SPEED = 50;

    private String name;
    private int speed;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        this.speed = updateSpeed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = updateSpeed();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    protected int updateSpeed() {
        return randomSpeed(MAX_RANDOM_SPEED);
    }

    protected int randomSpeed(int maxSpeed){
        return  new SecureRandom().nextInt(maxSpeed);
    }
}
