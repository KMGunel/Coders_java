package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class TheMinimalSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long min =999999999;
        int count=0;
        for (int i = m; i <=n; i++) {
             long s=sumOfDigit(i);
             if(s<=min){
                 min=s;
                 count++;
             }
        }
        System.out.println(count);


    }
    public static int sumOfDigit(int i) {
        int sum = 0;
        int digit = 0;
        while (i != 0) {
            digit= i%10;
            sum = sum + digit;
            i = i / 10;
        }
        return sum;
    }
}
