package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        for(int i=2;i<=n;i++){
          int num2= sc.nextInt();
           if (num2<num){
              num=num2;
          }
        }
        System.out.println(num);
}
}
