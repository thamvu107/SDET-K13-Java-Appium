package src.labs.lab_9;

import java.util.Random;

public class Animal {
    /*
     * + id
     * + type
     * + flyable
     * + speed
     *  + Horse: Max 75 km/h
     *  + Tiger: Max 100 Km/h
     *  + Dog: Max 60 KM/h*
     * */
    protected static final int DEFAULT_MAX_SPEED = 50;

    // Properties
    protected String id;
    protected String type;
    protected String name;
    protected boolean flyable;
    protected int speed;

    public Animal(AnimalBuilder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.name = builder.name;
        this.flyable = builder.flyable;
        this.speed = builder.speed;
    }

    // READ ONLY
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return speed;
    }


    public static class AnimalBuilder {
        protected static int increaseId;
        protected String id;
        protected String name;
        protected String type;
        protected boolean flyable;
        protected int speed;

        public AnimalBuilder(String name) {
            this.id = formatAnimalId(++increaseId);
            this.name = name;
            this.speed = randomSpeed(DEFAULT_MAX_SPEED);
        }

        // WRITE-ONLY
        public AnimalBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public AnimalBuilder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        protected String formatAnimalId(int id) {
            return String.format("%03d", id);
        }

        protected int randomSpeed(int maxSpeed) {
            return new Random().nextInt(maxSpeed + 1);
        }

        protected Animal build() {
            return new Animal(this);
        }
    }
}
