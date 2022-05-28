package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fibonacciNum(n));
    }
    public  static int fibonacciNum(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else {
            return fibonacciNum(n-1)+fibonacciNum(n-2);
        }
    }
}
