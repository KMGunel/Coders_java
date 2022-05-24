package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class ValueOfVariable6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double y = valueOfVariable(x);
        System.out.printf("%.3f",y);
    }
    public static double valueOfVariable(double x){
        double y = ((Math.sqrt(Math.pow(x,4)+1))/Math.pow(x,2))-(Math.sqrt((Math.pow(x,2)/(Math.pow(x,2)+1))));
        return y;
    }
}
