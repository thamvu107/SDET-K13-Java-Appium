package src.labs.lab_7.animal;

import src.labs.lab_7.employee.EmployeeController;

import java.util.Arrays;
import java.util.List;

public class AnimalDemo {
    /*
    * Racing animal simple version
    * Horse: Max 75 km/h
    * Tiger: Max 100 Km/h
    * Dog: Max 60 KM/h*
    *
    * Create an Animal class with a method speed() which return a random speeds
    * Create 3 objects for those 3 animal type
    * Run and see which animal is winner for racing
    * Print result with format: Winner is <Animal name>, with speed: <speed>
    * int randomSpeed = new SecureRandom().nextInt(50);
    * */
    public static void main(String[] args) {
        Animal unknownAnimal = new Animal("unknown Animal");

        Animal horse = new Horse();
        horse.setName("Horse");
        horse.setSpeed();

        Animal tiger = new Tiger("Tiger");

        Animal dog = new Dog("Dog");

        List<Animal> animalList = Arrays.asList(unknownAnimal, horse, tiger, dog);

        AnimalController.printAllAnimal(animalList);

        Animal winner = AnimalController.findWinnerAnimal(animalList);
        System.out.printf("Winner is %s, with speed: %d", winner.getName(), winner.getSpeed());
    }
}
