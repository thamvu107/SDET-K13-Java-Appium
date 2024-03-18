package src.lessons.lesson_10.P03_EmployeeAbstractionVersion;


import java.util.Arrays;
import java.util.List;

public class EmployeeSalaryDemo {
    public static void main(String[] args) {

        Employee ti = new Contract("Ti");
        Employee teo = new Contract("Teo");
        Employee tam = new Contract("Tam");
        Employee tu = new FTE("Tu");
        Employee tung = new FTE("Tung");
        List<Employee> employeeList = Arrays.asList( ti, teo, tam, tu, tung);

        SalaryController.printAllEmployees(employeeList);
        double totalSalary = new SalaryController().getTotalSalary(employeeList);
        System.out.println("\nTotal Employee Salary: " + SalaryController.formatDecimal(totalSalary) );
    }
}
