package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        double arr[] = new double[h];
        int m = 0;
        double sum = 0;
        for(int i=0;i<h;i++){
            arr[i] = sc.nextDouble();
            if(arr[i]<0){
                sum=sum+arr[i];
                m++;
            }
        }
        System.out.printf("%d %.2f",m,sum);
    }
}
