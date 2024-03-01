package src.lessons.lesson_10.P01_EmployeeCastingVersion;

public class Employee {
    protected static int increaseId = 1;

    // Attributes
    protected int employeeId;
    protected String name;
    protected EmployeeType employeeType;
    protected double baseSalary;

    public Employee(String name, EmployeeType employeeType, double baseSalary) {
        this.employeeId = increaseId++;
        this.name = name;
        this.employeeType = employeeType;
        this.baseSalary = baseSalary;
    }

    // Behaviors
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    protected double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", employeeType=" + employeeType +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
