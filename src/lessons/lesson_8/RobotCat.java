package src.lessons.lesson_8;

// Supper class, parent class
public class RobotCat extends Machine {
    // Attributes
    private String name;
    private String productionDate;
    // Constructor Overloading
    public RobotCat() {
    }

    public RobotCat(String name) {
        this.name = name;
    }

    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    // Behavior
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public void introduce() {
        System.out.println("I'm RobotCat");
    }

    /*
     * Overloading:
     *  + SAME class
     *  + Base on method signature: same function + different params
     *  + Happen in: Compile time
     * */

    /*
     * Overriding:
     * + At least 2 classes AND subclass class Inheritance parent class
     * + based on method signature: same ( same function + same params)
     * + happen in: Running time
     * */
    protected String charge() {
        return "charging";
    }

    @Override
    public String toString() {
        return "RobotCat{" + "name='" + name + '\'' + "}\n";
    }
}
