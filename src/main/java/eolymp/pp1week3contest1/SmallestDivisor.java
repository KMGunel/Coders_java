package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n%2==0){
            System.out.println(2);
        }
        else{
            for( int i = 3;i<=n;i++){
            if( n % i == 0 ) {
                System.out.println(i);
                break;
            }
        }}

    }
}
