package main.java.eolymp.pp1week3contest1;

import java.util.Scanner;

public class WindyWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int num3 = num;
        int max = 0;
        int min = 0;
        for(int i=2;i<=n;i++){
            int num2= sc.nextInt();
            if (num2<num){
                num=num2;
            }
            min = num;
            if(num2>num3){
                num3=num2;
            }
            max = num3;
        }
        System.out.println(max-min);
    }
}
