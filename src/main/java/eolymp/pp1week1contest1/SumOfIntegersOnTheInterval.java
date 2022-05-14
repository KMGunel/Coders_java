package main.java.eolymp.pp1week1contest1;

import java.util.Scanner;

public class SumOfIntegersOnTheInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println((a + b) * (b - a + 1L) / 2L);
    }
}
