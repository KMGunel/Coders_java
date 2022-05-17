package main.java.exercise.Syllabus.Lesson6;


import java.util.Scanner;

public class LoopExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Neçə ədəd daxil etmək istəyirsiniz?");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Say düzgün daxil edilməmişdir!");

        } else {
            int neg = 0;
            int pos = 0;
            int zero = 0;
            for (int i = 1; i <= n; i++) {
                System.out.printf("%d-ci ədədi daxil edin \n ", i);
                int num = sc.nextInt();
                if (num > 0) {
                    pos++;
                } else if (num < 0) {
                    neg++;
                } else {
                    zero++;
                }
            }
            System.out.printf("Nəticə:\nPositiv rəqəmlərin sayı: %d \nNegativ rəqəmlərin sayı: %d \n0-larin sayı: %d", pos, neg, zero);


        }
    }
}
