package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class NumbersWithDifferentDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        differentDigits(a,b);
    }

    public static void differentDigits(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i / 1000 == i / 100 % 10 || i / 1000 == i / 10 % 10 ||
                    i / 1000 == i % 10 || i / 100 % 10 == i / 10 % 10 ||
                    i / 100 % 10 == i % 10 || i / 10 % 10 == i % 10) {
                continue;
            } else {
                System.out.printf("%d ", i);

            }
        }
    }
}
