package main.java.eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        toRomanNumber(stringToNumArray(string));

    }
    public static int stringToNumArray(String string) {
        String[] arr = string.split("");
        int count = 0;
        int[] newArr = new int[count];
        for (String s : arr) {
            if (s.equalsIgnoreCase("I")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 1;
            } else if (s.equalsIgnoreCase("V")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 5;
            } else if (s.equalsIgnoreCase("X")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 10;
            } else if (s.equalsIgnoreCase("L")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 50;
            } else if (s.equalsIgnoreCase("C")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 100;
            } else if (s.equalsIgnoreCase("D")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 500;
            } else if (s.equalsIgnoreCase("M")) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = 1000;
            }

        }
        int n = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i < newArr.length - 1 && newArr[i] < newArr[i + 1]) {
                n = n + (newArr[i + 1] - newArr[i]);
                i++;
            } else {
                n = n + newArr[i];
            }
        }
        return n;
    }
    public static void toRomanNumber(int n){
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int count = 0;
        int[] newArr = new int[count];
        for (int value : arr) {
            int num = n / value * value;
            n = n - num;
            if (num != 0) {
                count++;
                newArr = Arrays.copyOf(newArr, count);
                newArr[newArr.length - 1] = num;
            }
        }

        for (int k : newArr) {
            if (k >= 1000) {
                int m = k / 1000;
                for (int j = 0; j < m; j++) {
                    System.out.print("M");
                }
            } else if (k >= 900) {
                System.out.print("CM");
            } else if (k >= 500) {
                System.out.print("D");
            } else if (k >= 400) {
                System.out.print("CD");
            } else if (k >= 100) {
                int m = k / 100;
                for (int j = 0; j < m; j++) {
                    System.out.print("C");
                }
            } else if (k >= 90) {
                System.out.print("XC");
            } else if (k >= 50) {

                System.out.print("L");

            } else if (k >= 40) {
                System.out.print("XL");
            } else if (k >= 10) {
                int m = k / 10;
                for (int j = 0; j < m; j++) {
                    System.out.print("X");
                }
            } else if (k >= 9) {
                System.out.print("IX");
            } else if (k >= 5) {
                System.out.print("V");
            } else if (k >= 4) {
                System.out.print("IV");
            } else if (k >= 1) {
                for (int j = 0; j < k; j++) {
                    System.out.print("I");
                }
            }
        }
    }

}


