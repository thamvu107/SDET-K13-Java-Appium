package src.labs.lab_9;

public class Horse extends Animal {
    public Horse(AnimalBuilder builder) {
        super(builder);
    }

    protected static class HorseBuilder extends AnimalBuilder {
        public static final int MAX_HORSE_SPEED = 75;

        public HorseBuilder(String name) {
            super(name);
            this.type = "Horse";
            this.speed = randomSpeed(MAX_HORSE_SPEED);
        }

        protected Horse build() {
            return new Horse(this);
        }
    }
}
