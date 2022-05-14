package main.java.pp1week2contest1;

import java.util.Scanner;

public class ConditionalStatement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x < -4){
            System.out.println(x+5);
        }
        else if(x > 7) {
            System.out.println(x*x*x+2*x);
        }

        else{
            System.out.println(x*x-3*x);
        }

    }
}
