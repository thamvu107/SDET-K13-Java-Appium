package src.lessons.lesson11.polymorphism;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The dog say: bow wow");
    }
}
