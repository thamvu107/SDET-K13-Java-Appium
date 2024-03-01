package src.lessons.lesson_10.P01_EmployeeCastingVersion;

import java.text.DecimalFormat;
import java.util.List;

public class EmployeeController {

    public static double calculateSalaryTotal(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee emp : employeeList) {
            // Casting | BAD practice
            totalSalary += (emp instanceof FullTimeEmployee) ? emp.getBaseSalary() + ((FullTimeEmployee) emp).getSupportSalary() : emp.getBaseSalary();

        }
        return totalSalary;
    }

    public static void printAllEmployees(List<Employee> employeeList) {
        System.out.println("Print all employees:");

        for (int index = 0; index < employeeList.size(); index++) {
            Employee emp = employeeList.get(index);
            String typeText = "(".concat(EmployeeType.CONTRACT.equals(emp.getEmployeeType()) ? "Contract" : "Full time").concat(")");
            double salary = (emp instanceof FullTimeEmployee) ? emp.getBaseSalary() + ((FullTimeEmployee) emp).getSupportSalary() : emp.getBaseSalary();

            System.out.printf("%d. %-5s %-15s %s\n", emp.getEmployeeId(), emp.getName(), typeText, formatDecimal(salary));
        }
    }

    public static String formatDecimal(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.0");
        return decimalFormat.format(number);
    }
}
