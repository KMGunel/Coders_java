package main.java.hackerrank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder string = new StringBuilder(sc.next());
        chekPolindrom(string);

    }
    public static void chekPolindrom(StringBuilder string){
        StringBuilder newString=new StringBuilder();
        for (int i = string.length()-1; i >=0 ; i--) {
            newString.append(string.charAt(i));
        }

        if(String.valueOf(string).equals(String.valueOf(newString))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
