package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class GreatestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        greatestDivisor(n);
    }
    public static void greatestDivisor(long n){
        int count =0;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                count++;
                System.out.println(n/i);
                break;
            }
        }
        if (count==0) {
            System.out.println(1);

        }
    }
}
