package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class Exponentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n = sc.nextDouble();

        System.out.printf("%.0f ", exp(x, n));
    }

    public static double exp(double x, double n) {
        if (n == 1 ) {
            return x;
        } else {
            return x * exp(x, (n - 1));
        }
    }

}
