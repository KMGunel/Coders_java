package main.java.eolymp.linearArrays;

import java.util.Scanner;

public class SumOfNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        int m = 0;
        int sum =0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (i=0; i < n ; i++) {

            if(arr[i]<0) {
               sum=sum+arr[i] ;
               m++;
            }
        }
        if(m==0){
            System.out.println(0);
        }
        else{
        System.out.println(sum);
        }
    }
}
