package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class SumOfSomeRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.printf("%.4f\n%.4f\n%.4f", a + b, a + b + c, a + b + c + d);
    }
}
