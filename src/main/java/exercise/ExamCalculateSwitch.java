package main.java.exercise;

import java.util.Scanner;

public class ExamCalculateSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin!");
        double a = sc.nextDouble();
        System.out.println("Operator seçin ( '+', '-', '*', '/' )!");
        char ch  = sc.next().charAt(0);
        System.out.println("Ikinci ədədi daxil edin!");
        double b = sc.nextDouble();
        System.out.println("Nəticə: ");

        switch (ch) {
            case'+':{
                System.out.println(a+b);
                break;
            }
            case'-':{
                System.out.println(a-b);
                break;
            }
            case'*':{
                System.out.println(a*b);
                break;
            }
            case'/':{
                System.out.println(a/b);
                break;
            }
            case'%':{
                System.out.println(a%b);
                break;
            }
            default:{
                System.out.println("Operator düzgün daxil edilməmişdir!");
            }


        }


    }
}
