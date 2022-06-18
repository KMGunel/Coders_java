package main.java.exercise.others;

import java.util.Scanner;

public class ReverseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str = sc.next();

        System.out.printf("Reversing word is : %s",reverseMethod(str));
    }
    public static String reverseMethod(String str){
        char[] arr = new char[str.length()];
        for (int i = str.length()-1,j=0; i >=0 ; i--) {
            arr[j]=str.charAt(i);
            j++;
        }
        return String.valueOf(arr);
    }
}
