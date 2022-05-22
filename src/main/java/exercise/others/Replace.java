package main.java.exercise.others;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("x", " ").trim().replace(" ", "x");
        System.out.println(str);

    }
}
