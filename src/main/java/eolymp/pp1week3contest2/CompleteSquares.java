package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class CompleteSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        squares(n, arr);
    }

    public static void squares(int n, int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += i;
            System.out.printf("%d ", (int) Math.pow(arr[i],2));
        }
        System.out.printf("%d ", (int) Math.pow(n,2));
    }
}
