package src.lessons.lesson_10.P01_EmployeeCastingVersion;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {
    /*
    * BROKEN IS-A relationship ( use Casting)
    * */
    public static void main(String[] args) {
        // NOTE: Employee emp1 = new Employee("Ti", EmployeeType.FULL_TIME, 50_000); this version not working for super class cast to subclass

        Employee fte1 = new FullTimeEmployee("Teo");
        Employee fte2 = new FullTimeEmployee("Tung");
        Employee fte3 = new FullTimeEmployee("Tam");
        Employee fte4 = new FullTimeEmployee("Tam");

        Employee contract1 = new ContractEmployee("Chi");

        List<Employee> employeeList = Arrays.asList( fte1, fte2, fte3, fte4,contract1);

        EmployeeController.printAllEmployees(employeeList);

        double salaryTotal = new EmployeeController().calculateSalaryTotal(employeeList);

        System.out.println("\nTotal salary of employees: " + EmployeeController.formatDecimal(salaryTotal));
    }

    /*
     * Create a class Employee with a method salary to return employee’s salary
     * There are 2 types of employee: Full time employee and contract employee
     * Full time employee has salary is 50000 and contract employee has salary 40000
     * Write a method to accept a list of Employee and calculate total salary
     * For example, company has 3 FTE  and 2 contractor
     *
     * //
     * Create Employee parent Object
     * + ID
     * + Name
     * + DOB
     * + Salary
     *
     * Create FullTimeEmp child Object Extend Employee
     * +  Salary = 50000; // overriding
     * Create ContractEmp child Object Extend Employee
     *  + Salary = 40000 // overriding
     *
     *  double salary = baseSalary + bonus - deductions;
     *
     * create an array ftEmployees has 3 FTEs.
     * Create an array contractEmployees has 2 Contractors
     * List<Employee> employees = new ArrayList ;
     * Add all ftEmployees
     * Add all contractEmployees
     *
     * double getSalaryTotal(List<Employee> employees)
     *  SalaryTotal =0;
     *  for loop employees list
     *      SalaryTotal += emp.getSalary;
     *  return SalaryTotal;
     * */
}
