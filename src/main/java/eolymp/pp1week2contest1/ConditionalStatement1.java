package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class ConditionalStatement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x<5){
            System.out.println(x*x-3*x+4);
        }
        else{
            System.out.println(x+7);
        }

    }
}
