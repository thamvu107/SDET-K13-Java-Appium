package src.labs.lab_7.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static final String UNNAMED = "unnamed";

    public static List<Animal> getGeneralAnimaList(String[] animalNames) {

        List<Animal> animalList = new ArrayList<>();
        for (String animalName : animalNames) {
            Animal animal = UNNAMED.equals(animalName) ? new Animal() : new Animal(animalName);
            animalList.add(animal);
        }

        return animalList;
    }

    public static List<Animal> getDogList(String[] names) {
        List<Animal> dogList = new ArrayList<>();
        for (String name : names) {
            Dog dog = UNNAMED.equals(name) ? new Dog() : new Dog(name);
            dogList.add(dog);
        }

        return dogList;
    }

    public static List<Animal> getTigerList(String[] names) {
        List<Animal> tigerList = new ArrayList<>();
        for (String name : names) {
            Tiger tiger = UNNAMED.equals(name) ? new Tiger() : new Tiger(name);
            tigerList.add(tiger);
        }

        return tigerList;
    }

    public static List<Animal> getHorseList(String[] names) {
        List<Animal> horseList = new ArrayList<>();
        for (String name : names) {
            Horse horse = UNNAMED.equals(name) ? new Horse() : new Horse(name);
            horseList.add(horse);
        }

        return horseList;
    }

    public static void printAllAnimal(List<Animal> animalList) {
        System.out.println("Print all animal:");
        for (int index = 0; index < animalList.size(); index++) {
            Animal animal = animalList.get(index);
            String type = AnimalTypes.UNDEFINED.equals(animal.getType()) ? "Unknown type" : animal.getType().toString().toLowerCase();
            System.out.printf("%-3s. %-20s %-20s %d km/h\n", animal.getId(), animal.getName(), "(".concat(type).concat(")"), animal.getSpeed());
        }
    }

    public static Animal findWinnerAnimal(List<Animal> animalList) {
        Animal winner = animalList.get(0);

        for (Animal animal : animalList) {
            int speed = animal.getSpeed();
            if (speed > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void printWinnerAnimal(Animal winner) {
       String animalType = winner.getType().toString();
       String animalTypeText = AnimalTypes.UNDEFINED.equals(animalType) ? "an unknown animal type" : "a ".concat(animalType.toLowerCase());
        System.out.printf("\nWinner is %s - %s (%s), with speed: %d km/h", winner.getId(), winner.getName(), animalTypeText, winner.getSpeed());
    }

}
