package main.java.exercise.hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            str.append(foul(a,b,n)+"\n");
        }
        System.out.println(str);

    }
    public static StringBuilder foul(int a,int b,int n){
        int result = (int) (a+(Math.pow(2,0)*b));
        StringBuilder str = new StringBuilder();
            for (int j = 1,i=0; j <= n; j++,i++) {
                str.append(result+" ");
                result = result +(b*(int)Math.pow(2,j));
            }
        return str;
    }
}
