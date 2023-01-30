package ch17_oop_assignment1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Company.addNewEmployee();
        }

        //System.out.println(Company.employees);

        while (true) {
            System.out.println("What do you want to do? Select: 1, 2, 3, 4");
            System.out.println("1: Salary sum");
            System.out.println("2: Employee info");
            System.out.println("3: Add new employee");
            System.out.println("4: Exit");

            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();


            switch (x) {

                case 1:
                    Company.salarySum();
                    break;

                case 2:
                    for (Employee employee : Company.employees) {
                        employee.getAllInfo();
                    }
                    System.out.println();
                    break;

                case 3:
                    Company.addNewEmployee();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("I don't know this command.");
            }

        }
    }

}
