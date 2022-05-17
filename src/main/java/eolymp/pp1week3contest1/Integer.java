package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n= sc.nextDouble();
        int num = (int) n;
        if( n == num){
            System.out.println("Ok");
        }
        else{
            System.out.println("No");
        }
    }
}
