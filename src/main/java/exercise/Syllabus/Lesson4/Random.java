package main.java.exercise.Syllabus.Lesson4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        double num =  Math.random()*101;
        int number = (int) num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Let enter the name !");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        System.out.println("Enter the number!");
        int n = sc.nextInt();

        for ( ; ; n = sc.nextInt() ) {
            if ( n > number){
            System.out.println("Your number is too big. Please, try again.");
        }
        else if (n < number){
            System.out.println("Your number is too small. Please, try again.");
        }
        else{
            System.out.printf("Congratulations, %s!\n",name);
        }
        }

    }
}
