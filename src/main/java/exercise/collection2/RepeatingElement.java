package main.java.exercise.collection2;

import java.util.*;

public class RepeatingElement {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>();
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(5);
        myList.add(5);
        myList.add(3);
        myList.add(5);
        myList.add(5);
        System.out.println(myList);

        Map<Integer,Integer> myMap = new HashMap<>();

        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i ==it.next()) {
                myMap.put(i,1);

            }
        }


        System.out.println(myMap);


    }
}
