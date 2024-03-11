package src.lessons.Lesson_12;

public class Human implements IRaceAble{
    private int speed;
    @Override
    public int speed() {

        this.speed = 10;
        return this.speed;
    }

    @Override
    public String toString() {
        return "Human{" +
                "speed=" + speed +
                '}';
    }
}
