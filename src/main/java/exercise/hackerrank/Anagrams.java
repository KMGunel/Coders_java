package main.java.exercise.hackerrank;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder a=new StringBuilder(sc.next());
        StringBuilder b=new StringBuilder(sc.next());

        chekAnagram(a,b);
    }
    public static void chekAnagram(StringBuilder a,StringBuilder b){
        if(a.length()==b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (String.valueOf(a.charAt(i)).equalsIgnoreCase(String.valueOf(b.charAt(j)))) {
                        b.deleteCharAt(j);
                        break;

                    }System.out.println(b);
                }
            }
            if(b.length()==0){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
