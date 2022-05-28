package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class ModularExponentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n = sc.nextDouble();
        double m = sc.nextDouble();

        System.out.printf("%.0f ", modExp(x, n,m));
    }

    public static double modExp(double x, double n,double m) {
        if (n == 1 ) {
            return x*(1%m);
        } else {
            return x * modExp(x, (n - 1)%m,m);
        }
    }

}
