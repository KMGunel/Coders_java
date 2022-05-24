package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        coins(n,arr);
    }

    public static void coins(int n, int[] arr) {
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
        }
        if(count0<count1){
            System.out.println(count0);
        }
        else{
            System.out.println(count1);
        }

    }
}
