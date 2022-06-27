package main.java.exercise.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();
        String b=sc.next().toLowerCase();

        chekAnagram(a,b);
    }
    public static void chekAnagram(String a,String b){

            String[] arra = new String[a.length()];
            String[] arrb = new String[b.length()];
            for (int i = 0,j=0; i < a.length(); i++,j++) {
                arra[j]=String.valueOf(a.charAt(i)) ;
            }
            for (int i = 0,j=0; i < b.length(); i++,j++) {
                arrb[j]=String.valueOf(b.charAt(i)) ;
            }
            Arrays.sort(arra);
            Arrays.sort(arrb);
            if(Arrays.toString(arra).equalsIgnoreCase(Arrays.toString(arrb))){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }


    }
}
