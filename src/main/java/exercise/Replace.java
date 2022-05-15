package main.java.exercise;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("x", " ");
        str= str.trim();
        str = str.replace(" ","x");
        System.out.println(str);

}
}
