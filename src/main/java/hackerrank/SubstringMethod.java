package main.java.hackerrank;

import java.util.Scanner;

public class SubstringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start= sc.nextInt();
        int end = sc.nextInt();

        str = str.substring(start,end);
        System.out.println(str);
    }
}
