package src.lessons.lesson_8;

// Supper class, parent class
public class RobotCat extends Machine{
    private String name;
    private String productionDate;

    public RobotCat() {
    }

    public RobotCat(String name) {
        this.name = name;
    }

    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

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
     *  + Compile time
     *  + Base on method signature: same function + different params
     *
     * */

    /*
    * Overriding happen when
    * + at least 2 classes
    * AND subclass class Inheritance parent class
    * AND happen in running time
    * method signature: same ( same function + same params)
    * */
    protected String charge(){
        return "charging";
    }
    @Override
    public String toString() {
        return "RobotCat{" + "name='" + name + '\'' + "}\n";

    }
}
