package main.java.exercise.others;

import java.util.Scanner;

public class MethodExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println( findMax(n));
        int m= sc.nextInt();
        System.out.println( findMin(m));

    }
    public static int findMax(int n){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return(max);
    }
    public static int findMin(int m){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[m];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return(min);
    }
}
