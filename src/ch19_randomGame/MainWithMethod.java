package ch19_randomGame;

import java.util.Random;
import java.util.Scanner;

public class MainWithMethod {

    public static void main(String[] args) {

        //number of trials
        int k = 5;

        int numberToGuess = new Random().nextInt(10);


        for (int i = 0; i < k; i++) {

            getNumberFromUser();


            if (getNumberFromUser() == numberToGuess) {
                System.out.println("Congratulations! Correct number is: " + numberToGuess);
                return;
            } else if (getNumberFromUser() > 10) {
                System.out.println("This number is too big. You have " + (k - i - 1) + " attempts left.");
            } else if (getNumberFromUser() < 0) {
                System.out.println("This number is too small. You have " + (k - i - 1) + " attempts left.");
            } else if (getNumberFromUser() != numberToGuess) {
                System.out.println(getNumberFromUser() + " is not the right number. You have " + (k - i - 1) + " attempts left.");
            }

            if (i==k-1) {
                System.out.println("I'm sorry - you didn't guess the number. Correct number is: " + numberToGuess);
            }

        }


    }

    public static int getNumberFromUser() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me your number.");
        return sc.nextInt();
    }


}
