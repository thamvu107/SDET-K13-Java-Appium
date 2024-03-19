package src.lessons.lesson7;

// Template | Lombok
public class RobotCat {

    private String name; // private = restricted access

    // Constructor
    public RobotCat() {

    }

    // Overloading constructor
    public RobotCat(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public  void setName( String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "RobotCat{" + "name='" + name + '\'' + "}\n";
    }



}
