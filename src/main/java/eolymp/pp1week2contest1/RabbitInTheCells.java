package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class RabbitInTheCells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m%n==0) {
            System.out.println(m/n);
        }
        else {
            System.out.println(m/n+1);
        }
    }
}
