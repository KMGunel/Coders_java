package main.java.eolymp.pp1week3contest1;

import java.util.Arrays;
import java.util.Scanner;

public class Watermelons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        if(n<=1){
            System.out.println("Ooops!");
        }
        else{
            System.out.printf("%d %d ",arr[0],arr[arr.length-1]);
        }
 }
}
