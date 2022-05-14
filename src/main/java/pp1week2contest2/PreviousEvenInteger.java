package main.java.pp1week2contest2;

import java.util.Scanner;

public class PreviousEvenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2==0){
            System.out.println(n-2);
        } else if (n==0) {
            System.out.println(-2);

        }
        else {
            System.out.println(n-1);
        }
    }
}
