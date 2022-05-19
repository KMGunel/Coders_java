package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class IncreaseBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = sc.nextInt();
        if (num1>=0){
            num1=num1+2;

        }
        for(int i = 2;i<=n;i++){
           int num = sc.nextInt();
            if(num>=0){
              num=num+2;

        }System.out.printf(num1 + " " +num);



        }

}
}
