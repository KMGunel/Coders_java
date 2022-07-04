package main.java.exercise.functionalInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();



         IFunctionalInterface fi = new IFunctionalInterface() {
             @Override
             public Integer toCount(String str) {
                 String strArr[]=str.split(" ");
                 return strArr.length;
             }
         };
        IFunctionalInterface fi2 = new IFunctionalInterface() {
            @Override
            public Integer toCount(String str) {
                return str.length();
            }
        };
    }
}
