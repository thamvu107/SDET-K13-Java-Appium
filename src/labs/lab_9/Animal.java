package src.labs.lab_9;

import java.util.Random;

public class Animal {
    /*
     * + id
     * + type
     * + flyable
     * + speed
     * */
    protected static final int MAX_SPEED = 50;

    // Properties
    protected String id;
    protected String type;
    protected boolean flyable;
    protected int speed;

    public Animal(AnimalBuilder builder) {
        this.id = builder.id;
        this.type = builder.type;
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

    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return speed;
    }


    public static class AnimalBuilder {
        protected static int increaseId;

        protected String id;
        protected String type;
        protected boolean flyable;
        protected int speed;

        public AnimalBuilder(String type) {
            this.id = formatAnimalId(++increaseId);
            this.type = type;
            this.speed = randomSpeed();
        }

        // WRITE-ONLY

        public AnimalBuilder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        protected String formatAnimalId(int id) {
            return String.format("%03d", id);
        }
        protected int randomSpeed() {
            return new Random().nextInt(MAX_SPEED + 1);
        }
        protected Animal build() {
            return new Animal(this);
        }
    }
}
