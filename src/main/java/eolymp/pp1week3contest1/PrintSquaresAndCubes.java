package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class PrintSquaresAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            System.out.printf("%s ",(long)Math.pow(i,2));
        }
        System.out.println();
        for(int i = b;i>=a;i--){
            System.out.printf("%s ",(long)Math.pow(i,3));
        }
    }
}
