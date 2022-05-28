package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class RecursionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recurcionCalc(n));
    }
    public static int recurcionCalc(int n){
        if (n==0){
            return 0;
        }
        else if (n>0){
            return recurcionCalc(n-1)+n;
        }
        else {
            return 1;
        }
    }
}
