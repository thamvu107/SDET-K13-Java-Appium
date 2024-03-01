package src.labs.lab_9;

import java.util.Random;

public class Tiger extends Animal{
    public static final int MAX_TIGER_SPEED = 100;

    public Tiger(TigerBuilder builder) {
        super(builder);
    }

    public static class TigerBuilder extends AnimalBuilder {
        public TigerBuilder(String type) {
            super(type);
        }

        @Override
        protected int randomSpeed() {
            return new Random().nextInt(MAX_TIGER_SPEED + 1);
        }

        @Override
        protected Animal build() {
            return new Tiger(this);
        }
    }
}
