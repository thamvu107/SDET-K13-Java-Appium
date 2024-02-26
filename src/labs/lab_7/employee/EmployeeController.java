package src.labs.lab_7.employee;

import src.lessons.lesson_8.RobotCat;

import java.util.List;

public class EmployeeController {

    public static double calculateBaseSalaryTotal(List<Employee> employeeList) {
        double baseSalaryTotal = 0;
        for (Employee employee : employeeList) {
            baseSalaryTotal += employee.getBaseSalary();
        }
        return baseSalaryTotal;
    }

    public  static void printAllEmployees(List<Employee> employeeList){
        System.out.println("Print all employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
