package main.java.exercise.syllabus.lesson8;

import java.util.Scanner;

public class PentagonalNumbersDinamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pentagonalNumbers(n);
    }

    public static void pentagonalNumbers(int n) {
        int number = 0;
        for (int i = 0; i < n; i++) {
            number = number + (3 * i + 1);
            System.out.println(number);
        }
    }
}
