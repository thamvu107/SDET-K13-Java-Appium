package src.labs.lab_9;

import src.labs.lab_9.Animal.AnimalBuilder;
import src.labs.lab_9.Tiger.TigerBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {
    /* Racing animal simple version
     * Horse: Max 75 km/h
     * Tiger: Max 100 Km/h
     * Dog: Max 60 KM/h*
     * */

    public static final int MAX_TIGER_SPEED = 100;
    public static final int MAX_HORSE_SPEED = 75;
    public static final int MAX_DOG_SPEED = 60;

    public static int randomSpeed(int maxSpeed) {
        return new Random().nextInt(maxSpeed + 1);
    }

    public static List<Animal> getTigers(int numbers) {
        List<Animal> list = new ArrayList<>();
        for (int index = 0; index < numbers; index++) {
            TigerBuilder builder =  new TigerBuilder("Tiger");
            Tiger tiger = (Tiger) builder.setFlyable(false).build();
            list.add(tiger);
        }

        return list;
    }

    public static List<Animal> getHorses(int numbers) {
        List<Animal> list = new ArrayList<>();
        for (int index = 0; index < numbers; index++) {

        }

        return list;
    }

    public static List<Animal> getDogs(int numbers) {
        List<Animal> list = new ArrayList<>();
        for (int index = 0; index < numbers; index++) {

        }

        return list;
    }

    public static void printAllRacer(List<Animal> animalList) {
        for (Animal animal : animalList) {
            System.out.printf("%-3s %-6s %-3s km/h\n", animal.getId(), animal.getType(), animal.getSpeed());
        }
    }

    public static Animal findAnimalWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);

        for (Animal animal : animalList) {
            int speed = animal.getSpeed();
            if (speed > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void printAnimalWinner(Animal winner) {
        System.out.printf("\nWinner is %s - %s , with speed: %d km/h", winner.getId(), winner.getType(),  winner.getSpeed());


    }
}
