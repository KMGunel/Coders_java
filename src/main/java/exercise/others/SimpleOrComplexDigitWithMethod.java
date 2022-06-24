package main.java.exercise.others;

import java.util.Scanner;

public class SimpleOrComplexDigitWithMethod {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        simpleOrComplex(n);
    }
    public static void simpleOrComplex(int n){
        int count=0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                count++;
                break;
            }
        }
        if (n==0){
            System.out.println("Daxil edilən ədəd 0-dır.");
        }
        else if (count>0){
            System.out.println("Daxil edilən MÜRƏKKƏB ədəddir.");
        }
        else{
            System.out.println("Daxil edilən ədəd SADƏ ədəddir.");
        }
    }
}
