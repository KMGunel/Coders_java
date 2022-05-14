package main.java.pp1week2contest1;

import java.util.Scanner;

public class TheLevelOfEducationalAchievements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        if (x>=1 && x<=3) {
            System.out.println("Initial");
        } else if (x >= 9 && x<=12) {
            System.out.println("High");
        } else if (x > 3 && x<7) {
            System.out.println("Average");
        } else {
            System.out.println("Sufficient");
        }
    }
}
