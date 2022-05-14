package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        int w = sc.nextInt();
        int l = sc.nextInt();
        if (r < Math.sqrt(w*w+l*l)/2 ) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}