package main.java.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> myNewList= new ArrayList<>();
        StringBuilder newStr= new StringBuilder();
        newStr.append(sc.next());
        int n = sc.nextInt();

        getSmallestAndLargest(newStr,n,myNewList);
        myNewList.sort((s, anotherString) -> myNewList.get(1).compareTo(myNewList.get(0)));
        System.out.println(myNewList.get(0));
        System.out.println(myNewList.get(1));
    }
    public static void getSmallestAndLargest(StringBuilder newStr,int n, List<String> myNewList){
        List<String> myList= new ArrayList<>();
        while (newStr.length() >=n ) {
            myList.add( newStr.substring(newStr.length()-n,newStr.length()));
            newStr.deleteCharAt(newStr.length()-1);
        }
        myNewList.add(myList.get(0));
        myNewList.add(myList.get(myList.size()-1));
    }

}
