package main.java.pp1week2contest1;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < b ){
            System.out.println(a + " " + b);
        }
        else{
            System.out.println(b + " " + a);
        }
    }
}
