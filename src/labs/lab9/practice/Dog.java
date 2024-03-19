package src.labs.lab9.practice;

public class Dog extends Animal {
    public static final int MAX_DOG_SPEED = 60;

    public Dog(AnimalBuilder builder) {
        super(builder);
    }

    public static DogBuilder builder (String name){
        return new DogBuilder(name);
    }
    protected static class DogBuilder extends AnimalBuilder {

        public DogBuilder(String name) {
            super(name);
            this.type = "Dog";
            this.speed = randomSpeed(MAX_DOG_SPEED);

        }

        @Override
        protected Animal build() {
            return new Dog(this);
        }
    }
}
