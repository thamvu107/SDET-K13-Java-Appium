package src.lessons.lesson12.designPattern;

public class BabyDuck extends Duck{
    public BabyDuck() {
        this.quackBehaviour = new Squeak();
        this.flyBehaviour= new FlyNoway();
    }

}
