package main.java.exercise.syllabus.lesson11;

import java.util.Scanner;

public class checkValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password.");
        String password = sc.next();
        checkPassword(password);
    }

    public static void checkPassword(String password) {

            char[] arr = password.toCharArray();
            int countDigit = 0;
            int countLetterOrDigit = 0;
            for (char c : arr) {
                if (Character.isLetterOrDigit(c)) {
                    countLetterOrDigit++;
                }
                if (Character.isDigit(c)) {
                    countDigit++;
                }
            }

            if (arr.length < 10) {
                System.out.println("A password must have at least ten characters.");

            } else if (countLetterOrDigit < arr.length) {
                System.out.println("A password consists of only letters and digits.");

            } else if (countDigit < 2) {
                System.out.println("A password must contain at least two digits.");

            } else {
                System.out.println("Correct password!");
            }

    }

}
