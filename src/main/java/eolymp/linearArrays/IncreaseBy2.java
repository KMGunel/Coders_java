package main.java.eolymp.linearArrays;

import java.util.Scanner;

public class IncreaseBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>=0) {
                arr[i]=arr[i]+2;
            }
        }

        for (i = 0; i < n ; i++) {
            System.out.printf("%d ",arr[i]);

        }
    }
}
