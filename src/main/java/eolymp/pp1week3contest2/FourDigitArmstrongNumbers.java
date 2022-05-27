package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class FourDigitArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        armstrongNumbers(a,b);
    }
    public static void armstrongNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if( i == (int)Math.pow(i / 1000,4) + Math.pow(i / 100 % 10,4) + Math.pow(i / 10 % 10,4) + Math.pow(i % 10,4)){
            System.out.printf("%d ", i);
            }
        }
    }
}
