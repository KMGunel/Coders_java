package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class Rectangle2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rectangleMakeTwo(n);


    }
    public static void rectangleMakeTwo(int n){
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
