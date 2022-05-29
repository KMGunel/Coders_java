package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gCD(a,b));
    }
    public static int gCD(int a,int b){

        int num = a%b;
        while(a%b!=0){
           num=a%b;
           a=b;
           b=num;
        }
        return num;
    }
}
