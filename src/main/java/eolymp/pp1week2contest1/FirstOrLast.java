package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n/100 > n%10){
            System.out.println(n/100);
        } else if (n/100 == n%10) {
            System.out.println("=");
        }
        else{
            System.out.println(n%10);
        }
    }
}
