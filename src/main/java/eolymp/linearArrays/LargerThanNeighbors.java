package main.java.eolymp.linearArrays;

import java.util.Scanner;

public class LargerThanNeighbors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        int m = 0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (i=1; i < n-1 ; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1] ) {
                m++;
            }

        }
        System.out.println(m);
    }
}
