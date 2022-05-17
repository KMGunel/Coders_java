package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class SumAndProductOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double sum = x + y + z;
        double product = x * y * z;
        System.out.printf("%.4f %.4f", sum, product);
    }
}
