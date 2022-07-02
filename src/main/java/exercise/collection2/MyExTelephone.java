package main.java.exercise.collection2;

import java.util.*;

public class MyExTelephone {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your message!");
        String str = sc.next();
        List<Integer> myList=new ArrayList<>();
        List<Integer> myNewList=new ArrayList<>();

        String[] newStr=str.split("");
        for (int i = 0; i < newStr.length; i++) {
            myList.add(Integer.valueOf(newStr[i]));
        }

        int j=95;
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i)==2){
                j=95;
            } else if (myList.get(i)==3) {
                j=97;
            }else if (myList.get(i)==4) {
                j=99;
            }else if (myList.get(i)==5) {
                j=101;
            }else if (myList.get(i)==6) {
                j=103;
            }else if (myList.get(i)==7) {
                j=105;
            }else if (myList.get(i)==8) {
                j=108;
            }else if (myList.get(i)==9) {
                j=109;
            }
            if(i<myList.size()-3 && myList.get(i) == myList.get(i + 1) &&
                    myList.get(i+1) == myList.get(i + 2)&& myList.get(i+2) == myList.get(i +3) && myList.get(i)==7) {
                myNewList.add(115);
                i+=3;
            }
            if(i<myList.size()-3 && myList.get(i) == myList.get(i + 1) &&
                    myList.get(i+1) == myList.get(i + 2)&& myList.get(i+2) == myList.get(i +3) && myList.get(i)==9) {
                myNewList.add(122);
                i += 3;
            }
            else if(i<myList.size()-2 && myList.get(i) == myList.get(i + 1) && myList.get(i+1) == myList.get(i + 2)) {
                myNewList.add(myList.get(i)+j+2);
                i+=2;
            }
            else if(i<myList.size()-1 && myList.get(i) == myList.get(i + 1)) {
                myNewList.add(myList.get(i)+j+1);
                i++;
            }
            else {
               myNewList.add(myList.get(i)+j);
           }
        }
                System.out.print("Message: ");
                    for(Integer i:myNewList){
                     System.out.print(Character.toChars(i));
                }
    }
}
