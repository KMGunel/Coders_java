package main.java.exercise.syllabus.lesson4;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {
    public static void main(String[] args) {
//        double num = Math.random()*101;
//        int number = (int) num;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1;
        System.out.println("Let enter the name:");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        System.out.println("Enter the number.");
        int n = 1;
        for (int i = 1; i <= n; i++) {
            n = sc.nextInt();
            if (n > number) {
                System.out.println("Your number is too big. Please, try again.");
            } else if (n < number) {
                System.out.println("Your number is too small. Please, try again.");
            } else {

                System.out.printf("Congratulations, %s!\n", name);
                break;

            }
        }

    }
}
