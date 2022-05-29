package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class Exponentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();

        System.out.println(exp(x, n));
    }

    public static long exp(long x, long n) {
        long number =(long) Math.pow(x,n);
        return number;
    }

}
