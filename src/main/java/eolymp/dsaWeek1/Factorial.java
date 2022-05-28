package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(findFactorial(n));
    }
    public static long findFactorial(long n){
        if (n == 1 ){
            return 1;
        }
        else {
            return n*findFactorial(n-1);
        }
    }
}
