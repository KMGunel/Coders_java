package main.java.eolymp.pp1week2contest2;


import java.util.Scanner;

public class DeleteOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n/100<=n/10%10 && n/100<=n%10 ){
            System.out.println(n/10%10 + "" + n%10);
        }
        else if (n/10%10<=n%10 && n/10%10<=n/100 ){
            System.out.println(n/100 + "" + n%10);
        }
        else if (n%10<=n/100 && n%10<=n/10%10 ){
            System.out.println(n/100 + "" + n/10%10);
        }
        else{
            System.out.println(n/10%10 + "" + n%10);
        }
    }
}
