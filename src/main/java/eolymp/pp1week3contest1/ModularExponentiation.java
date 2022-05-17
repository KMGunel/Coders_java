package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class ModularExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((long)Math.pow(x,n)%m);

    }
}
