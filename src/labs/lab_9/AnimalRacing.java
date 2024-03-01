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
        List<Animal> tigerList = Racing.getTigers(10);
      /*  List<Animal> horseList = Racing.getTigers(10);
        List<Animal> dogList = Racing.getTigers(30);
        List<Animal> eagleList = Racing.getTigers(30);*/

        List<Animal> animalRacingList = new ArrayList<>();
        animalRacingList.addAll(tigerList);

        Racing.printAllRacer(tigerList);
        Animal winner = Racing.findAnimalWinner(tigerList);
        Racing.printAnimalWinner(winner);

    }
}
