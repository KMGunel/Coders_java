package main.java.exercise.collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String[] newStr=str.split(" ");
        Map<String,String>myDictionary=new HashMap<>(Map.of("mother","ana","hello",
                "salam","book","kitab","read","oxumaq","friend","dost","student","telebe"));
        for(String s:newStr){
            translate(myDictionary,s);
        }

    }
    public static void translate(Map<String,String>myDictionary,String s){
                if(myDictionary.containsKey(s)){
                    System.out.print(myDictionary.get(s) + " ");
                }
                else {
                    System.out.println("This word not found in my dictionary" + " - " + s);
                }
    }
}
