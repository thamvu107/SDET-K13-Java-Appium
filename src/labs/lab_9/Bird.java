package src.labs.lab_9;

import src.labs.lab_9.Animal;

public class Bird extends Animal {

    public Bird(AnimalBuilder builder) {
        super(builder);
    }

    protected static class BirdBuilder extends AnimalBuilder {
        protected BirdBuilder(String name) {
            super(name);
            this.type = "Bird";
            this.flyable = true;
        }

        @Override
        protected Animal build() {
            return new Bird(this);
        }
    }
}
