package main.java.eolymp.pp1week2contest2;

import java.util.Scanner;

public class ConditionalStatement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        if (x>=0) {
            double yd = Math.pow(x,3)+2*Math.pow(x,2)+4*x-6;
            int y = (int) yd;
            System.out.println(y);
        }
        else {
            double yd = Math.pow(x,3)-7*x;
            int y = (int) yd;
            System.out.println(y);

        }

    }
}
