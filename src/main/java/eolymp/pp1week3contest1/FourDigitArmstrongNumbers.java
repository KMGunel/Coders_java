package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class FourDigitArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            double sum = Math.pow(i / 1000,4) + Math.pow(i / 100 % 10,4) +Math.pow(i / 10 % 10,4)+ Math.pow(i % 10,4);
            int sum4 = (int)sum;
            if ( sum4==i ) {
                System.out.printf("%d ",i);
            }

        }
    }
}
