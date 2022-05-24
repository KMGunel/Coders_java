package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class SumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.printf("%.4f %.4f %.4f",x+y,x+z,y+z);
    }
}
