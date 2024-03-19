package src.labs.lab7.employee;

public class ContractEmployee extends Employee{
    protected static final double CONTRACT_SALARY = 40_000;

    public ContractEmployee(String name) {
        super(name, EmployeeType.CONTRACT, CONTRACT_SALARY);
    }

}
