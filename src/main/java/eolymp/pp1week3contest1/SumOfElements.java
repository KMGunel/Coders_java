package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        double sum = 0;
        for(int i=0;i<n;i++){
        arr[i]= sc.nextDouble();
        sum= sum + arr[i];
        }
        System.out.printf("%.1f",sum);
    }
}

