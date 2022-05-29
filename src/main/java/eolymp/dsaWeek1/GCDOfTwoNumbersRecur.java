package main.java.eolymp.dsaWeek1;

import java.util.Scanner;

public class GCDOfTwoNumbersRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gCDRec(a,b));
    }
    public static int gCDRec(int a,int b){
            if(b==0){
                return a;
            }
            else if(a==0) {
                return b;
            }
            else if (a>=b){
               return gCDRec(a%b,b);
            }
            else {
                return gCDRec(a,b%a);
            }
    }
}
