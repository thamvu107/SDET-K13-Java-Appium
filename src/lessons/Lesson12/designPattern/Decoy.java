package src.lessons.Lesson12.designPattern;

public class Decoy extends Duck{
    public Decoy() {
        this.quackBehaviour = new Mute();
        this.flyBehaviour = new FlyNoway();
    }
}
