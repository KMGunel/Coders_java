package main.java.pp1week2contest2;

import java.util.Scanner;

public class SquareOfMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n/100 >= n/10%10 && n/10%10 >= n%10){
            int x = Integer.parseInt((int) n/100 + "" + n/10%10 + "" + n%10);
            System.out.println(x*x);
        }
        else if(n/100 >= n%10 && n%10 >= n/10%10){
            int x = Integer.parseInt((int) n/100 + "" + n%10 + "" + n/10%10);
            System.out.println(x*x);
        }
        else if(n/10%10 >= n/100 && n/100 >= n%10){
            int x = Integer.parseInt((int) n/10%10 + "" + n/100 + "" + n%10);
            System.out.println(x*x);
        }
        else if(n/10%10 >= n%10 && n%10 >= n/100){
            int x = Integer.parseInt((int) n/10%10 + "" + n%10 + "" + n/100);
            System.out.println(x*x);
        }
        else if(n%10 >= n/100 && n/100 >= n/10%10){
            int x = Integer.parseInt((int) n%10 + "" + n/100+ "" + n/10%10);
            System.out.println(x*x);
        }
        else if(n%10 >= n/10%10 && n/10%10 >= n/100){
            int x = Integer.parseInt((int) n%10 + "" + n/10%10 + "" + n/100);
            System.out.println(x*x);
        }
    }
}
