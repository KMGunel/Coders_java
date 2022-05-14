package main.java.pp1week2contest1;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a % b == 0){
            System.out.println("Divisible");
        }
        else{
            System.out.println(a/b + " " + a%b);
        }

    }
}
