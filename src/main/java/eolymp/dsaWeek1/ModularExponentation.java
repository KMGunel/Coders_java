package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class ModularExponentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println( modExp(x, n,m));
    }

    public static long modExp(long x, int n,int m) {
        long number = 1;
        for (int i = 1; i <=n ; i++) {
            number = x * number%m ;
        }

        return number;
    }

}
