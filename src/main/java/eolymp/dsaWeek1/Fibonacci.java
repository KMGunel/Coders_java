package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        System.out.println(fibonacciN(n));
    }
    public  static long fibonacciN(long n){
        if(n==0){
            return 1;
        } else if (n==1) {
            return 1;
        }
        else {
            return fibonacciN(n-1)+fibonacciN(n-2);
        }
    }
}
