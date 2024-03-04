package src.labs.lab_10;

public class Contract extends Employee {

    public static final int CONTRACT_SALARY = 40_000;
    public static final int SUPPORT_SALARY = 0;
    public Contract(String name) {
        super(name);
        this.baseSalary = CONTRACT_SALARY;
        this.supportSalary = SUPPORT_SALARY;
    }

    @Override
    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public double getSupportSalary() {
        return this.supportSalary;
    }
}
