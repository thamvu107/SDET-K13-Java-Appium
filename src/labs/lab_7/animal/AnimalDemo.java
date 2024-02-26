package src.labs.lab_7.animal;

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
        System.out.println(unknownAnimal);
        System.out.println(unknownAnimal.getSpeed());

        Animal horse = new Horse();
        horse.setName("Horse");
        horse.setSpeed();
        System.out.println(horse);

        Animal tiger = new Tiger("Tiger");
        System.out.println(tiger);
    }
}
