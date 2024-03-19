package src.lessons.lesson12.comparable;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee thisEmp, Employee thatEmp) {
        return thisEmp.getName().compareToIgnoreCase(thatEmp.getName());
    }
}
