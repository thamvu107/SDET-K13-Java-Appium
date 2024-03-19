package src.labs.lab10;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SalaryController {

    public SalaryController() {

    }

    public static List<Employee> createContractEmployees(String[] names) {
        List<Employee> employeeList = new ArrayList<>();
        for (String name : names) {
            Employee employee = new Contract(name);
            employeeList.add(employee);
        }

        return employeeList;
    }

    public static List<Employee> createFullTimeEmployees(String[] names) {
        List<Employee> employeeList = new ArrayList<>();
        for (String name : names) {
            Employee employee = new FTE(name);
            employeeList.add(employee);
        }

        return employeeList;
    }

    public double calculateTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getBaseSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }

    public static void printAllEmployees(List<Employee> employeeList) {
        System.out.println("Print all employees:");
        System.out.printf("%-3s %-7s %-12s %s\n", "ID", "Name", "Type", "Salary");
        for (int index = 0; index < employeeList.size(); index++) {
            Employee emp = employeeList.get(index);
            String isFTE = (emp instanceof Contract) ? "Contract" : "Full time";
            double salary = emp.getBaseSalary() + emp.getSupportSalary();
            System.out.printf("%-3s %-7s %-12s %s\n", emp.getEmployeeId(), emp.getName(), isFTE, formatDecimal(salary));
        }
    }

    public static String formatDecimal(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(number);
    }
}
