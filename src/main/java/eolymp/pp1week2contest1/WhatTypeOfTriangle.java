package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class WhatTypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        if(a==b && b==c ){
            System.out.println(1);
        }
        else if (a==b || b==c || a==c) {
            System.out.println(2);
        }
        else {
            System.out.println(3);
        }
    }
}
