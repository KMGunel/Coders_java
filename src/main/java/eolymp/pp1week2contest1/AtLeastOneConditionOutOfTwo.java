package main.java.eolymp.pp1week2contest1;

import java.util.Scanner;

public class AtLeastOneConditionOutOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2!=0){
            System.out.println("YES");
        }
        else if(n/100>0 && n/100<10 && n>0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
