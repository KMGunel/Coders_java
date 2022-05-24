package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        timer(n);
    }
    public static void timer(int n){
        for (int i = n; i >=0 ; i--) {
            System.out.printf("%d sek\n",i);
        }
    }
}
