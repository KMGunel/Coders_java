package main.java.eolymp.pp1week1contest2;

import java.util.Scanner;

public class SumOfSquaresOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n/1000)*(n/1000)+(n/100%10)*(n/100%10)+(n/10%10)*(n/10%10)+(n%10)*(n%10));
    }
}




