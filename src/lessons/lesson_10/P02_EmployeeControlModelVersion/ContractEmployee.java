package src.lessons.lesson_10.P02_EmployeeControlModelVersion;

public class ContractEmployee extends Employee {
    protected static final double CONTRACT_SALARY = 40_000;

    public ContractEmployee(String name) {
        super(name, EmployeeType.CONTRACT, CONTRACT_SALARY);
    }

}
