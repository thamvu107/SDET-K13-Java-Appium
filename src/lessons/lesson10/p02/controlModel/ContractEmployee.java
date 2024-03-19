package src.lessons.lesson10.p02.controlModel;

public class ContractEmployee extends Employee {
    protected static final double CONTRACT_SALARY = 40_000;

    public ContractEmployee(String name) {
        super(name, EmployeeType.CONTRACT, CONTRACT_SALARY);
    }

}
