package src.lessons.lesson_10.P03_EmployeeAbstractionVersion;

public abstract class Employee {
    /*
     * Inheritance, Encapsulation, Abstraction(3), Polymorphism
     * (3): Strong force IS-A relationship
     *
     * */
    protected static int increaseId;

    // Properties
    protected int employeeId;
    protected String name;
    protected EmployeeType employeeType;
    protected double baseSalary;
    protected double supportSalary;

    public Employee(String name) {
        this.employeeId = ++increaseId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getBaseSalary();

    public abstract double getSupportSalary();

}
