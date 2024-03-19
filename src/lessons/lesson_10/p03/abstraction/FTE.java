package src.lessons.lesson_10.p03.abstraction;

public class FTE extends Employee{
    // Must override abstract method
    public static final int FULL_TIME_SALARY = 50_000;
    public static final int SUPPORT_SALARY = 1_000;

    public FTE(String name) {
        super(name);
        this.baseSalary = FULL_TIME_SALARY;
        this.supportSalary = SUPPORT_SALARY;
    }


    @Override
    public double getBaseSalary() {
        return FULL_TIME_SALARY;
    }

    @Override
    public double getSupportSalary() {
        return SUPPORT_SALARY;
    }

}
