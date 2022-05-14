package main.java.eolymp.pp1week1contest1;

import java.util.Scanner;

public class HotelRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println((n - 1L) * 3L * m);
    }
}
