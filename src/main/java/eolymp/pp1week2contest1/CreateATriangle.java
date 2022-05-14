package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class CreateATriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if (area > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
