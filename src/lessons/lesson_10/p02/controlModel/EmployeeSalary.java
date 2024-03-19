package src.lessons.lesson_10.p02.controlModel;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {
    /*
    * BROKEN IS-A relationship ( use Casting)
    * */
    public static void main(String[] args) {
        // NOTE: Employee emp1 = new Employee("Ti", EmployeeType.FULL_TIME, 50_000); this version not work for super class cast to subclass

        Employee teo = new FullTimeEmployee("Teo");
        Employee tung = new FullTimeEmployee("Tung");
        Employee tamA = new FullTimeEmployee("Tam");
        Employee tamB = new FullTimeEmployee("Tam");
        Employee chi = new ContractEmployee("Chi");
        Employee chau = new ContractEmployee("Chau");
        Employee chuong = new ContractEmployee("Chuong");

        List<Employee> employeeList = Arrays.asList( teo, tung, tamA, tamB, chi, chau);

        EmployeeController.printAllEmployees(employeeList);

        double salaryTotal = new EmployeeController().calculateSalaryTotal(employeeList);

        System.out.println("\nTotal salary of employees: " + EmployeeController.formatDecimal(salaryTotal));
    }
}
