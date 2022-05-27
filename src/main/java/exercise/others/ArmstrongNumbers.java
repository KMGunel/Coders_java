package main.java.exercise.others;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            armstrongNumbers(i);
        }
    }

    public static void armstrongNumbers(int i) {
        String str = String.valueOf(i);
        int m = str.length();
        int sum = 0;
        int n = 1;
        for (int j = 1; j <= m; j++) {
            int number = (i / n) % 10;
            n *= 10;
            sum = sum + (int) Math.pow(number, 4);
        }
        if (sum == i) {
            System.out.println(i);
        }
    }
}
