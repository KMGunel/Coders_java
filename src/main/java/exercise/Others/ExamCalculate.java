package main.java.exercise.Others;

import java.util.Scanner;

public class ExamCalculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin!");
        double a = sc.nextDouble();
        System.out.println("Operator seçin ( '+', '-', '*', '/' )!");
        char ch  = sc.next().charAt(0);
        System.out.println("Ikinci ədədi daxil edin!");
        double b = sc.nextDouble();
        System.out.println("Nəticə: ");

        if (ch == '+') {
            System.out.println(a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Emeliyyat sehvdir!");}


    }
}
