package src.lessons.lesson_11.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal= new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}
