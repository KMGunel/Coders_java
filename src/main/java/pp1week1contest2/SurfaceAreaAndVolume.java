package main.java.pp1week1contest2;

import java.util.Scanner;

public class SurfaceAreaAndVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(2*(a*b+b*c+a*c) + " " + a*b*c);
    }
}
