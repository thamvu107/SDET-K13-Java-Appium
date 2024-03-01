package src.lessons.lesson_10.P03_EmployeeAbstractionVersion;

import src.lessons.lesson_10.P03_EmployeeAbstractionVersion.EmployeeType;
import src.lessons.lesson_10.P03_EmployeeAbstractionVersion.FTE;

import java.text.DecimalFormat;
import java.util.List;

public class SalaryController {
    public double getTotalSalary (List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getBaseSalary() + employee.getSupportSalary();
        }
        return  totalSalary;
    }

    public static void printAllEmployees(List<Employee> employeeList) {
        System.out.println("Print all employees:");
        System.out.printf("%-3s %-7s %-14s %-17s %s\n", "ID", "Name", "Base Salary", "Support Salary", "Salary");
        for (int index = 0; index < employeeList.size(); index++) {
            Employee emp = employeeList.get(index);
            double salary = emp.getBaseSalary() + emp.getSupportSalary();
            System.out.printf("%-3s %-7s %-14s %-17s %s\n", emp.getEmployeeId(), emp.getName(), formatDecimal(emp.getBaseSalary()), formatDecimal(emp.getSupportSalary()), formatDecimal(salary));
        }
    }

    public static String formatDecimal(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(number);
    }

    public SalaryController() {

    }
}
