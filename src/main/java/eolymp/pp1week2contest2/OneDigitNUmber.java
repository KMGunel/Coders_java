package main.java.eolymp.pp1week2contest2;

import java.util.Scanner;

public class OneDigitNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( Math.abs(n/10) < 1 ){
            System.out.println("Ok");
        }
        else{
            System.out.println("No");
        }
    }
}
