package src.labs.lab_10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        String[] contractEmployeeNames = {"Ti", "Teo", "Tan"};
        List<Employee> contractEmployeeList = SalaryController.createContractEmployees(contractEmployeeNames);

        String[] fullTimeEmployeeNames = {"Bon", "Ba"};
        List<Employee> fullTimeEmployeeList = SalaryController.createFullTimeEmployees(fullTimeEmployeeNames);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(contractEmployeeList);
        employeeList.addAll(fullTimeEmployeeList);

        SalaryController.printAllEmployees(employeeList);
        double totalSalary = new SalaryController().calculateTotalSalary(employeeList);
        System.out.println("\nTotal Salary of employees: " + SalaryController.formatDecimal(totalSalary));
    }
}
