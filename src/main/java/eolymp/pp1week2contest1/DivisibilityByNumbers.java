package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class DivisibilityByNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(n % a == 0 && n % b == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
