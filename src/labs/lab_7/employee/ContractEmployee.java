package src.labs.lab_7.employee;

public class ContractEmployee extends Employee{
    protected static final double CONTRACT_SALARY = 40_000;

    public ContractEmployee(String name) {
        super(name, EmployeeType.CONTRACT, CONTRACT_SALARY);
    }

    @Override
    protected double getBaseSalary() {
        return CONTRACT_SALARY;
    }
}
