package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        oddities(n,arr);
    }
    public static void oddities(int n,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.printf("%d is even\n",arr[i]);
            }
            else{
                System.out.printf("%d is odd\n",arr[i]);
            }
        }
    }
}
