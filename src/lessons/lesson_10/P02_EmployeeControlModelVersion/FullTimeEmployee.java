package src.lessons.lesson_10.P02_EmployeeControlModelVersion;

public class FullTimeEmployee extends Employee {
    public static final double FULL_TIME_SALARY = 50_000;
    public static final double SUPPORT_SALARY = 1_000;

    public FullTimeEmployee(String name) {
        super(name, EmployeeType.FULL_TIME, FULL_TIME_SALARY);
        this.supportSalary = SUPPORT_SALARY;
    }


}
