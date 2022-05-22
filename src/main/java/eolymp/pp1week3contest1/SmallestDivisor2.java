package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class SmallestDivisor2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n = sc.nextLong();
        int dvsr=0;
        for (int i = 2; i <=(long) Math.sqrt(n); i++) {
            if(n%i==0){
                dvsr++;
                System.out.println(i);
                break;
            }
        }
        if (dvsr <1) {
            System.out.println(n);
        }

    }
}
