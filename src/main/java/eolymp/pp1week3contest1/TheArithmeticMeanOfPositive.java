package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class TheArithmeticMeanOfPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        double sum = 0;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextDouble();
            if (arr[i] >= 0) {
                sum = sum + arr[i];
                a++;
            }
            else {
                b++;
            }
        }
        if(b==n){
        System.out.println("Not Found");
        }
        else{
            System.out.printf("%.2f",sum/a);
        }

    }
}
