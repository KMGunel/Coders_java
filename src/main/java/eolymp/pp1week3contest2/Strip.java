package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class Strip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        strip(n);
    }
    public static void strip(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.print("#");
        }
    }
}
