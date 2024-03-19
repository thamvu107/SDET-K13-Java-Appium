package src.labs.lab9.practice;

public class Bird extends Animal {

    public Bird(AnimalBuilder builder) {
        super(builder);
    }

    public static BirdBuilder builder(String name){
        return new BirdBuilder(name);
    }

    protected static class BirdBuilder extends AnimalBuilder {
        protected BirdBuilder(String name) {
            super(name);
            this.type = "Bird";
        }

        @Override
        protected Animal build() {
            return new Bird(this);
        }
    }
}
