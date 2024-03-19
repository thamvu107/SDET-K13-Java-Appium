package src.lessons.Lesson12.interfaceExample;

public class Human implements IRaceAble, IRunAble{
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

    @Override
    public int stepLength() {
        return 10;
    }
}
