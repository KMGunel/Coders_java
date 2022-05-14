package main.java.pp1week2contest1;

import java.util.Scanner;

public class CentralHeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long l = sc.nextLong();
        long k = sc.nextLong();
        long v = h*w*l;

        if (v%k==0){
            System.out.println(v/k);
        }
        else {
            System.out.println(v/k+1);
        }

    }
}
