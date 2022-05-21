package main.java.eolymp.linearArrays;

import java.util.Scanner;

public class PrintArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        int m =0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>0) {
                m++;
            }
        }

        if(m==0){
            System.out.println("NO");
        }
        else{
        System.out.println(m);
        }
        for (i = 0; i < n ; i++) {

                if(arr[i]>0) {
                    System.out.printf("%d ",arr[i]);

                }
            }



        }
    }

