package main.java.pp1week2contest2;

import java.util.Scanner;

public class TwoDigitNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(Math.abs(n/10)>=1 && Math.abs(n/100) < 1){

            System.out.println("Ok");
        }
        else {
            System.out.println("No");
        }
    }
}

