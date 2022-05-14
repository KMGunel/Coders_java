package main.java.pp1week2contest2;

import java.util.Scanner;

public class ConditionalStatement5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();

            if (x>=13) {
                double yd = 3*Math.pow(x,3)+4*Math.pow(x,2)+5*x+6;
                long y = (long) yd;
                System.out.println(y);
            }
            else {
                double yd = 3*Math.pow(x,3)-2*Math.pow(x,2)-3*x-4;
                long y = (long) yd;
                System.out.println(y);

            }

        }

}
