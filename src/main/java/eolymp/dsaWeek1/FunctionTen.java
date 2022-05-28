package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class FunctionTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(functionCalc(m,n));
    }
    public static int functionCalc(int m,int n){
        if(m==0 || m==n){
            return 1;
        }
        else if (m>0 && n>m){
            return (functionCalc(m-1,n-1))+(functionCalc(m,n-1));
        }
        else{
            return 0;
        }
    }
}
