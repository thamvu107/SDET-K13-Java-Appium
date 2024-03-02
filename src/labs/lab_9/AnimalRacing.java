package src.labs.lab_9;

import src.labs.lab_9.Animal.AnimalBuilder;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnimalRacing {
    /*
     * Tiger: Max 100 Km/h
     * Horse: Max 75 km/h
     * Dog: Max 60 KM/h*

     * Racing animal with builder design pattern (adding attribute flyable)
     * Eagle, Falcon, Tiger, Snake....
     * Animal tiger = new Animal.Builder().withWings(false).....build();
     * Animal falcon = new Animal.Builder().withWings(true).....build();
     *
     * Animal
     * + ID
     * + type
     * + speed
     * + flyable
     * */
    public static void main(String[] args) {
        AnimalBuilder builder = new AnimalBuilder("Kaa");
        Animal snake = builder
                .setType("Snake")
                .setFlyable(false)
                .build();

        //String[] tigerNames = {"Shere Khan", "Rajah"};
        String[] tigerNames = {"Shere Khan"};
        List<Animal> tigerList = Racing.getTigers(tigerNames);

        //String[] horseNames = {"Cowboy Bean", "Pink Horse"};
        String[] horseNames = {"Cowboy Bean"};
        List<Animal> horseList = Racing.getHorses(horseNames);

        String[] dogNames = {"Toto", "Scooby-Doo", "Goofy", "Odie", "Snoopy", "Droopy", "Hooch", "Goofy", "Bolt", "Copper", "Dug", "Zero", "Astro", "Eddie", "Copper", "Goofy", "Goofy"};
        List<Animal> dogList = Racing.getDogs(dogNames);

        String[] birdNames = {"Eagle", "Falcon"};
        List<Animal> birdList = Racing.getBirds(birdNames);

        List<Animal> animalRacingList = new ArrayList<>();
        animalRacingList.add(snake);
        animalRacingList.addAll(birdList);
        animalRacingList.addAll(tigerList);
        animalRacingList.addAll(horseList);
        animalRacingList.addAll(dogList);

        Racing.printAllRacer(animalRacingList);
        Animal winner = Racing.findAnimalWinner(animalRacingList);
        Racing.printAnimalWinner(winner);

    }
}
