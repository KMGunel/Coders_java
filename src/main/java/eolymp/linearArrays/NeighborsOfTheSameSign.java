package main.java.eolymp.linearArrays;

import java.util.Scanner;

public class NeighborsOfTheSameSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int i = 0;
        for (; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (i=1; i < n ; i++) {
            if(arr[i]>0 && arr[i-1]>0) {
                System.out.printf("%d %d\n",arr[i-1],arr[i]);
            }
            else if(arr[i]<0 && arr[i-1]<0) {
                System.out.printf("%d %d\n",arr[i-1],arr[i]);
            }

        }
    }
}
