package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class TheSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long number = (long) Math.abs(n);
        System.out.println(sumOfDigits(number, lengthNumber(number)));

    }

    public static int lengthNumber(long number) {
        String str = String.valueOf(number);
        int count = str.length();
        return count;
    }

    public static long sumOfDigits(long number, int count) {
        int m = 1;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            long num = (number / m) % 10;
            m *= 10;
            sum = sum + num;
        }
        return sum;
    }

}
