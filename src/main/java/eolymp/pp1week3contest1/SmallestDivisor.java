package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextLong();

        for( int i = 2;i<=n;i++){
           double m = n/i;
           int num = (int)m;
            if(num==m){
//                if (i==1)
//                {continue;}
                System.out.println(i);
                break;
            }
        }
    }
}
