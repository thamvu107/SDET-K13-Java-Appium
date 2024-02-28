package src.labs.lab_7.animal;

import java.util.Random;

public class Animal {

    private static final int DEFAULT_MAX_SPEED = 50;
    protected static int increaseId = 1;

    protected String id;
    protected AnimalTypes type;


    protected String name;

    protected int speed;

    public Animal() {
        this.id = formatAnimalId(increaseId++);
        this.type = AnimalTypes.UNDEFINED;
        this.name = "Unnamed Animal";
        this.speed = randomSpeed();
    }

    public Animal(String name) {
        this.id = formatAnimalId(increaseId++);
        this.type = AnimalTypes.UNDEFINED;
        this.name = name;
        this.speed = randomSpeed();
    }

    public Animal(AnimalTypes type, String name) {
        this.id = formatAnimalId(increaseId++);
        this.type = type;
        this.name = name;
        this.speed = randomSpeed();
    }

    public String getId() {
        return id;
    }

    public AnimalTypes getType() {
        return type;
    }

    public void setType(AnimalTypes type) {
        this.type = type;
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
        this.speed = randomSpeed();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    protected String formatAnimalId(int id) {
        return String.format("%03d", id);
    }

    protected int randomSpeed() {
        return new Random().nextInt(DEFAULT_MAX_SPEED + 1);
    }

}
