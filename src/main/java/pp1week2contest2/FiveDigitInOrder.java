package main.java.pp1week2contest2;

import java.util.Scanner;

public class FiveDigitInOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( n/10000 < n/1000%10 && n/1000%10 < n/100%10 && n/100%10 < n/10%10 && n/10%10 < n%10 ) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
