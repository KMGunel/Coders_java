package main.java.exercise.syllabus.lesson8;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        middleCharacter(str);
    }

    public static void middleCharacter(String str){
        while(str.length()>2){
            str=str.substring(1,str.length()-1);
        }
        System.out.printf("The middle character in the string: %s",str);
    }
}
