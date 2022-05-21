package main.java.eolymp.linearArrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfMaximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        int m=0;
        int max=0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (i=arr.length-1; i >0 ; i--) {
            if (arr[arr.length-1]==arr[i]){
                m++;
            }
        }
        if(arr[arr.length-1]==arr[0]){
        System.out.println(m+1);
        }
        else{
            System.out.println(m);
        }
    }
}
