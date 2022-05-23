package main.java.exercise.syllabus.lesson8;

import java.util.Scanner;

public class CounterVowelsMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.printf("Number of vowel in the string: %s",vowelCount(str));

    }

    public static int vowelCount(String str) {
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'o' || ch[i] == 'e' || ch[i] == 'u' || ch[i] == 'i' || ch[i] == 'A' || ch[i] == 'O' || ch[i] == 'E' ||
                    ch[i] == 'U' || ch[i] == 'I') {
                count++;
            }
        }
        return count;
    }
}
