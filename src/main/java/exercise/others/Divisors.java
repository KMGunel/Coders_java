package main.java.exercise.others;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                 System.out.printf("%d ",i);
            }
        }
        for (int i = (int)Math.sqrt(n); i >=1 ; i--) {
            if (n % i == 0) {
                System.out.printf("%d ",n/i);
            }
        }

    }
}