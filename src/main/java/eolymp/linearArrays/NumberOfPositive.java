package main.java.eolymp.linearArrays;

import java.util.Scanner;

public class NumberOfPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        int m = 0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>0) {
                m++;
            }
        }
        System.out.println(m);
    }
}
