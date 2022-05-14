package main.java.pp1week2contest2;

import java.util.Scanner;

public class EachConditionOrTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n%3==0){
            if(n%2==0 && Math.abs(n/10)>=1 && Math.abs(n/100) < 1){
            System.out.println("YES");}
            else{
                System.out.println("NO");}
        }
        else{
            System.out.println("NO");
        }
    }
}
