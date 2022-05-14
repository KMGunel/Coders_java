package main.java.eolymp.pp1week2contest2;

import java.util.Scanner;

public class AllDigitsAreEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n / 1000)%2==0 && (n / 100 % 10)%2==0 && (n / 10 % 10)%2==0 && (n % 10) % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
