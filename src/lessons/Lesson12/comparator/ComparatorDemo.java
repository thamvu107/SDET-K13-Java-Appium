package src.lessons.Lesson12.comparator;

import java.util.Arrays;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        Employee ti = new Employee("Ti", 20, 30.5F);
        Employee teo = new Employee("Teo", 30, 30.5F);
        Employee tan = new Employee("Tan", 40, 30.5F);
        Employee tun = new Employee("Tun", 50, 30.5F);

        List<Employee> employeeList = Arrays.asList(ti, teo, tan, tun);
        System.out.println("BEFORE sorting: \n" + employeeList);

        employeeList.sort(new EmployeeComparatorAge());
        System.out.println("AFTER sorting by age\n" + employeeList);

        employeeList.sort(new EmployeeComparatorName());
        System.out.println("AFTER sorting by name\n" + employeeList);

    }
}
