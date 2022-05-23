package main.java.exercise.others;

import java.util.Scanner;

public class FindMinAndMaxWithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(findMax(n,arr));
        System.out.println(findMin(n,arr));
   }
    public static int findMax(int n,int[] arr){
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            return(max);

    }
    public static int findMin(int m,int[] arr){

        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
               if(arr[i]<min){
                min=arr[i];
            }
        }
        return(min);
    }
}
