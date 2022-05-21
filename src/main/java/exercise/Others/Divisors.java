package main.java.exercise.Others;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                 System.out.printf("%d %d ",i,n/i);
            }

        }

    }}