package src.labs.lab9;

public class Horse extends Animal {
    public Horse(AnimalBuilder builder) {
        super(builder);
    }

    public static HorseBuilder builder(String name) {
        return  new HorseBuilder(name);
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
