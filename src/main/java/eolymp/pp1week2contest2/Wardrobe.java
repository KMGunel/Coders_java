package main.java.eolymp.pp1week2contest2;

import java.util.Scanner;

public class Wardrobe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
                if(x>=a && y>=b){
            System.out.println("YES");
        }
        else if(x>=b && y>=a){
            System.out.println("YES");
        }
        else if(x>=c && y>=b){
            System.out.println("YES");
        }
        else if(x>=b && y>=c){
            System.out.println("YES");
        }
        else if(x>=a && y>=c){
            System.out.println("YES");
        }
        else if(x>=c && y>=a){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}



//if (x * y >= a * b || x * y >= b * c || x * y >= a * c) {
//        System.out.println("YES");
//        } else {
//        System.out.println("NO");
//        }

