package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double m = Math.sqrt(n);
        int num = (int) m;
        if(num==m){
            System.out.println(num);
        }
        else {
            System.out.println("No");}

    }
}
