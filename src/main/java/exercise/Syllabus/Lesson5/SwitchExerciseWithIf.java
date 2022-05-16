package main.java.exercise.Syllabus.Lesson5;

import java.util.Scanner;

public class SwitchExerciseWithIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (0-10).");
        int n = sc.nextInt();
        if(n>=0 && n<5){
            System.out.println("Suspenso");
        }
        else if (n==5){
            System.out.println("Aprobado");
        }
        else if (n==6){
            System.out.println("Bien");
        }
        else if (n>6 && n<9){
            System.out.println("Notable");
        }
        else if (n>=9 && n<=10){
            System.out.println("Sobresaliente");
        }
        else{
            System.out.println("Invalid number");
        }

    }
}
