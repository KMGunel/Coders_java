package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class NumberOfToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            double b = sc.nextDouble();
            if (b<50.00){
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}
