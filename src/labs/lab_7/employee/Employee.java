package src.labs.lab_7.employee;
import src.labs.lab_7.employee.EmployeeType;

public class Employee {
    int increaseEmployeeId;

    // Attributes
    protected int employeeId;
    protected String name;
    protected EmployeeType employeeType;

    private double baseSalary;

  /*  public Employee() {
        this("Ti To");
    }*/

   /* public Employee(String name) {
        this.employeeId = ++employeeId;
        this.name = name;
    }
*/
    public Employee(String name, EmployeeType employeeType, double baseSalary) {
        this.employeeId = ++employeeId; // TODO fixe auto increase ID
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

    protected double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        //String employeeTypeText = employeeType.equals(EmployeeType.FULL_TIME)? "Full time employee": "Contract";
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", salary='" + baseSalary + '\'' +
                '}';
    }
}
