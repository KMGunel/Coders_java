package main.java.exercise.syllabus.lesson12;

import java.util.Scanner;

public class MatrixNByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        int number = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ",number);
                number++;
            }
            System.out.println();
        }
    }
}
