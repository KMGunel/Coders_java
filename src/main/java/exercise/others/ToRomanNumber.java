package main.java.exercise.others;

import java.util.Arrays;
import java.util.Scanner;

public class ToRomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toRomanNumber(n);
    }
    public static void toRomanNumber(int n){
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int num = 0;
        int count = 0;
        int[] newArr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            num = n / arr[i] * arr[i];
            n = n - num;
            if (num != 0) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = num;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] >= 1000) {
                int m = newArr[i] / 1000;
                for (int j = 0; j < m; j++) {
                    System.out.print("M");
                }
            }
            else if (newArr[i] >= 900) {
                System.out.print("CM");
            }
            else if (newArr[i] >= 500) {
                System.out.print("D");
            }
            else if (newArr[i] >= 400) {
                System.out.print("CD");
            }
            else if (newArr[i] >= 100) {
                int m = newArr[i] / 100;
                for (int j = 0; j < m; j++) {
                    System.out.print("C");
                }
            }
            else if (newArr[i] >= 90) {
                System.out.print("XC");
            }
            else if (newArr[i] >= 50) {

                System.out.print("L");

            }
            else if (newArr[i] >= 40) {
                System.out.print("XL");
            }
            else if (newArr[i] >= 10) {
                int m = newArr[i] / 10;
                for (int j = 0; j < m; j++) {
                    System.out.print("X");
                }
            }
            else if (newArr[i] >= 9) {
                System.out.print("IX");
            }
            else if (newArr[i] >= 5) {
                System.out.print("V");
            }
            else if (newArr[i] >= 4) {
                System.out.print("IV");
            }
            else if (newArr[i] >= 1) {
                int m = newArr[i];
                for (int j = 0; j < m; j++) {
                    System.out.print("I");
                }
            }
        }
    }
}









