package main.java.pp1week2contest1;

import java.util.Scanner;

public class CityNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         byte n = sc.nextByte();
         byte m = sc.nextByte();
        if(n%2==0 && m%2==0){
            System.out.println(1);
        }
        else if(n%2!=0 && m%2!=0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
