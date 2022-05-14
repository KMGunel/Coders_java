package main.java.pp1week2contest2;

import java.util.Scanner;

public class PreviousOddInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2==0){
            System.out.println(n-1);
        } else if (n==0) {
            System.out.println(-1);

        }
        else {
            System.out.println(n-2);
        }


    }
}
