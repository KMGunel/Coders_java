package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr=new long[(int) n];
        long i = 2;
        for (; i <= n ; i++) {
            if(n%i==0) {
                System.out.printf("%d ",i);
                break;
                }
        }


    }
}
