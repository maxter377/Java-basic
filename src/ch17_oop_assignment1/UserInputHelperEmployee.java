package ch17_oop_assignment1;

import java.util.Scanner;

public class UserInputHelperEmployee {

    public static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me salary");
        return sc.nextInt();
    }

    public static String getFirstNameFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me your first name");
        return sc.nextLine();
    }

    public static String getLastNameFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me your last name");
        return sc.nextLine();
    }
}
