package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(differentDigit(n));

    }
    public static int differentDigit(int n){
        return (n/100) * (n/10%10) * (n%10);
    }
}
