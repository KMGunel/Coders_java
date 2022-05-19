package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class NumberWithDifferentDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            if (i / 1000 == i / 100 % 10 || i / 1000 == i / 10 % 10 || i / 1000 == i % 10 || i / 100 % 10 == i / 10 % 10 || i / 100 % 10 == i % 10 || i / 10 % 10 == i % 10) {
               continue;
            }
            else{
                System.out.printf("%d ",i);
            }
        }
    }
}
