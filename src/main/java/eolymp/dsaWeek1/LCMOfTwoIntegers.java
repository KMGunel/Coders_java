package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class LCMOfTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = findGCD(a,b);
        System.out.println(findLCM(a,b,gcd));
    }
    public static long findGCD(long a,long b){
        if(b==0){
            return a;
        }
        else if(a==0) {
            return b;
        }
        else if (a>=b){
            return findGCD(a%b,b);
        }
        else {
            return findGCD(a,b%a);
        }
    }
    public static long findLCM(long a ,long b, long gcd){
        return a*b/gcd;
    }
}
