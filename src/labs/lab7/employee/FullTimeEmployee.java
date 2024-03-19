package src.labs.lab7.employee;

public class FullTimeEmployee extends Employee{
    public static final double FULL_TIME_SALARY = 50_000;

    public FullTimeEmployee(String name) {
        super(name, EmployeeType.FULL_TIME, FULL_TIME_SALARY);
    }

    @Override
    protected double getBaseSalary() {
        return FULL_TIME_SALARY;
    }
}
