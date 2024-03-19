package src.labs.lab7.employee;

import java.text.DecimalFormat;
import java.util.List;

public class EmployeeController {

    public static double calculateBaseSalaryTotal(List<Employee> employeeList) {
        double baseSalaryTotal = 0;
        for (Employee employee : employeeList) {
            baseSalaryTotal += employee.getBaseSalary();
        }
        return baseSalaryTotal;
    }

    public static void printAllEmployees(List<Employee> employeeList) {
        System.out.println("Print all employees:");

        for (int index = 0; index < employeeList.size(); index++) {

            Employee emp = employeeList.get(index);
            String typeText = "(".concat(EmployeeType.CONTRACT.equals(emp.getEmployeeType()) ? "Contract" : "Full time").concat(")");

            System.out.printf("%d. %-5s %-15s %s\n", emp.getEmployeeId(), emp.getName(), typeText, formatDecimal(emp.getBaseSalary()));
        }
    }

    public static String formatDecimal(double number){
        DecimalFormat decimalFormat = new DecimalFormat("#,###.0");
        return decimalFormat.format(number);
    }
}
