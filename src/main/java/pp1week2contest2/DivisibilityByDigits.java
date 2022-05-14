package main.java.pp1week2contest2;

import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % (n / 1000) == 0 && n % (n / 100 % 10) == 0 && n % (n / 10 % 10) == 0 && n % (n % 10) == 0){
            System.out.println("YES");
    }
        else{
            System.out.println("NO");
        }
    }
}
