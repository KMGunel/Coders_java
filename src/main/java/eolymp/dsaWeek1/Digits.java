package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digit(n));
    }
    public static int digit(int n){
        String str = Integer.toString(n);
        int number = str.length();
        return number;
    }
}
