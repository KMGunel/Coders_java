package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class Marathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Marathon(a,b);
    }
    public static void Marathon(int a,int b){
        for (int i = a; i <=b ; i++) {
            System.out.printf("%d ",i);
        }
    }
}
