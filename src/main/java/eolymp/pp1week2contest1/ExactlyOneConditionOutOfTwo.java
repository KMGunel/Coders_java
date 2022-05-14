package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class ExactlyOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n % 2 == 0) {
            if (n < 0 && n % 3 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        if (n % 2 != 0) {
            if (n < 0 && n % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
