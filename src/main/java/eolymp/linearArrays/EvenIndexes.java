package main.java.eolymp.linearArrays;

import java.util.Scanner;

public class EvenIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();

        }
        for (i=0; i < n ; i+=2) {
    System.out.printf("%d ",arr[i]);

        }
    }
}
