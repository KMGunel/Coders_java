package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class DecompositionOfThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Math.abs(n/100));
        System.out.println(Math.abs(n/10%10));
        System.out.println(Math.abs(n%10));

    }
}
