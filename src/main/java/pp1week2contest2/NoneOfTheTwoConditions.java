package main.java.pp1week2contest2;

import java.util.Scanner;

public class NoneOfTheTwoConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n %2 == 0 && n > 0){
            System.out.println("NO");}
        else if(n %2 != 0 && n < 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}
