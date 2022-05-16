package main.java.exercise.Syllabus.Lesson5;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (0-10).");
        int n = sc.nextInt();
        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: {
                System.out.println("Suspenso");
                break;
            }
            case 5: {
                System.out.println("Aprobado");
                break;
            }
            case 6: {
                System.out.println("Bien");
                break;
            }
            case 7:
            case 8: {
                System.out.println("Notable");
                break;
            }
            case 9:
            case 10: {
                System.out.println("Sobresaliente");
                break;
            }
            default: {
                System.out.println("Invalid number");
            }
        }
    }
}

