package main.java.pp1week1contest2;

import java.util.Scanner;

public class SumAndProduct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        System.out.println((n/10 + n%10) + " " + ((n/10) * (n%10)));
    }
}
