package src.lessons.lesson12.designPattern;

public class DuckDemo {
    public static void main(String[] args) {

        // Strategy Design Pattern - (interface - HAS-A)
        // OpenClose: Open to extend, close to modify

        System.out.println("I'm Mallard Duck");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println("\nI'm Baby Duck");
        Duck babyDuck = new BabyDuck();
        babyDuck.performQuack();
        babyDuck.performFly();

        // Change behavior at runtime
        babyDuck.changeFlyBehavior(new FlyWithWings());
        babyDuck.performFly();

        System.out.println("\nI'm Decoy Duck");
        Duck decoy = new Decoy();
        decoy.performQuack();
        decoy.performFly();

    }
}
