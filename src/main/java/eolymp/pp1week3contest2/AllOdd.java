package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class AllOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] +=i;
        }
        allOdd(n,arr);
    }
    public static void allOdd(int n,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.printf("%d ",arr[i]);
            }
        }
    }
}
