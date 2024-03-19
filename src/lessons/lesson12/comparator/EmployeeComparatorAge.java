package src.lessons.lesson12.comparator;

import java.util.Comparator;

public class EmployeeComparatorAge implements Comparator<Employee> {
    @Override
    public int compare(Employee thisEmp, Employee thatEmp) {
        return thisEmp.getAge() - thatEmp.getAge();
    }
}
