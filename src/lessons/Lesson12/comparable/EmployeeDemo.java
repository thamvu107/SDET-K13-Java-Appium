package src.lessons.Lesson12.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee ti = new Employee("Ti", 70,  10);
        Employee teo = new Employee("Teo", 30, 20);
        Employee tun = new Employee("Tun", 20, 30);

        List<Employee> employeeList = Arrays.asList(ti, teo, tun);
        System.out.println("Before sorting:" + employeeList);

        Collections.sort(employeeList);
        System.out.println("After Sorting: " + employeeList);
    }
}
