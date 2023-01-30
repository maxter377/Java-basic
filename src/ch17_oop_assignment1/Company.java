package ch17_oop_assignment1;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public static List<Employee> employees = new ArrayList<>();

    public static void addNewEmployee() {
        String firstNameInput;
        String lastNameInput;
        int salaryInput;

        firstNameInput = UserInputHelperEmployee.getFirstNameFromUser();
        lastNameInput = UserInputHelperEmployee.getLastNameFromUser();
        salaryInput = UserInputHelperEmployee.getNumberFromUser();

        Employee employee = new Employee(firstNameInput, lastNameInput, salaryInput);
        Company.employees.add(employee);

    }

    public static void salarySum() {
        int salarySum = 0;

        for (Employee employee : Company.employees) {
            salarySum += employee.getSalary();
        }
        System.out.println("Salary sum is: " + salarySum);
        System.out.println();
    }
}
