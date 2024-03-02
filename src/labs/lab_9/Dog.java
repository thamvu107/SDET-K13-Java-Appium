package src.labs.lab_9;

public class Dog  extends Animal{
    public static final int MAX_DOG_SPEED = 60;

    public Dog(AnimalBuilder builder) {
        super(builder);
    }

    protected static class DogBuilder extends AnimalBuilder{

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
