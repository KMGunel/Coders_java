package main.java.exercise.syllabus.lesson5;

import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single character from the alphabet.");
        String str = sc.next();
        int str1 = str.codePointAt(0);
        if (str.length() > 1) {
            System.out.println("ERROR! Please enter a single character from the alphabet.");
        }
        else if ( str1 > 64 && str1 < 123 && str1 != 91 && str1 != 92 && str1 != 93 &&
                str1 != 94 && str1 != 95 && str1 != 96 ) {

            if(str.equalsIgnoreCase("a") || str.equalsIgnoreCase("e") ||
                    str.equalsIgnoreCase("i") || str.equalsIgnoreCase("o") ||
                    str.equalsIgnoreCase("u")) {
                System.out.println("Input letter is Vowel");
            }
            else{
                System.out.println("Input letter is Consonant");
            }
        }
//         else if ( str1 > 96 && str1 < 123 ) {
//
//            if(str.equals("a") || str.equals("e") ||
//                    str.equals("i") || str.equals("o") ||
//                    str.equals("u")) {
//                System.out.println("Input letter is Vowel");
//            }
//            else{
//                System.out.println("Input letter is Consonant");
//            }
//        }
        else {
            System.out.println("ERROR! Please enter a correct character from the alphabet.");
        }


    }
}
