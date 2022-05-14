package main.java.pp1week2contest2;

import java.util.Scanner;

public class Tourist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();

        if(b1+b2+b3>=k && a1+a2+a3<=w ){

            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
