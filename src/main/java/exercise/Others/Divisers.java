package main.java.exercise.Others;

import java.util.Scanner;

public class Divisers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int i = 1;
        if(n%2==0){
            for (i = 1; i <=n/2; i++) {
                if(n%i==0){
                    System.out.printf("%d %d ",i,n/i);
                }
            }
        }
        else{
            for (i = 1; i <=(n-1)/2; i++) {
                if(n%i==0){
                    System.out.printf("%d %d ",i,n/i);
                }
            }
        }
    }
}
