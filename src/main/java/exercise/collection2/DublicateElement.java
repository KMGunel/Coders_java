package main.java.exercise.collection2;

import java.util.*;

public class DublicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ArrayList size?");
        int n= sc.nextInt();
        List<Integer> myList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }
        System.out.println("My list:" + myList);
        System.out.println("My map:" + dublicateElement(myList));


    }
    public static Map<Integer,Integer> dublicateElement(List<Integer> myList) {
        Map<Integer,Integer> myMap = new HashMap<>();
        for(Integer element:myList){
            if(myMap.containsKey(element)){
                myMap.put(element,myMap.get(element)+1);
            }
            else{
                myMap.put(element,1);
            }
        }
        return myMap;
    }
}
