package main.java.eolymp.pp1week3contest1;

import java.util.Arrays;
import java.util.Scanner;


public class Egypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int j=0;
        int[]arr = new int[3];
        do {
            for (j = 0; j < 3; j++) {
                arr [j]= sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0]==0 && arr[1]==0 && arr[2]==0){
                System.out.println("");
            }
            else if(arr[2]*arr[2]==arr[1]*arr[1]+arr[0]*arr[0]){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
        while(arr[0]!=0 && arr[1]!=0 && arr[2]!=0);


    }
}