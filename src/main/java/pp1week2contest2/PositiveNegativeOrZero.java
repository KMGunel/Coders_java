package main.java.pp1week2contest2;


import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>0) {

            System.out.println("Positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else {

            System.out.println("Zero");

        }
    }
}