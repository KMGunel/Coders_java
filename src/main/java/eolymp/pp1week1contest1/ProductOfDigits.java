package main.java.eolymp.pp1week1contest1;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println((n/100)*(n/10%10)*(n%10));
    }
}
