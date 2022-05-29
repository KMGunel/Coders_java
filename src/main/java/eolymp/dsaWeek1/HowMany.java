package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class HowMany {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
        }

        public static long factorial(long number) {
            long product = 1;
            for (int i = 1; i <= number; i++) {
                product *= i;
            }
            return product;
        }
}
