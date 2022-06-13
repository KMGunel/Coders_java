package main.java.exercise.syllabus.lesson15;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int star=1;
        int space=(2*num-1)/2;
        for (int i = 0; i < num; i++) {
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
            star+=2;
            space-=1;
        }
        star=2*num-1;
        space=0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = star; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println();
            star-=2;
            space+=1;
        }
    }
}
