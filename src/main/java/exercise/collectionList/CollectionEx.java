package main.java.exercise.collectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size?");
        int n = sc.nextInt();
        System.out.println("Enter numbers:");
        List<Integer> myList = new ArrayList();
        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }

        System.out.printf("My Array List: %s\n", myList);
        System.out.printf("Minimum number in my List: %s\n", findMin(myList));
        System.out.printf("Maximum number in my List: %s\n", findMax(myList));
        System.out.print("Simple numbers in my List: "); findSimpleNum(myList);
        chekRepeat(myList);
        sortMinToMax(myList);

    }
    public static void chekRepeat(List<Integer> myList){
        List<Integer> myList2 = new ArrayList();
        for (int i = 0; i < myList.size(); i++) {
            int count = 0;
            Integer m = myList.get(i);
            for (Integer integer : myList) {
                if (integer.equals(m)) {
                    count++;
                }
            }
            myList2.add(count);
        }
        System.out.printf("\nCount max repeat number in my list: %s",findMax(myList2));
    }

    public static Integer findMin(List<Integer> myList) {
        Integer min = myList.get(0);
        for (Integer integer : myList) {
            if (integer<min) {
                min = integer;
            }
        }
        return min;
    }

    public static Integer findMax(List<Integer> myList) {
        Integer max = myList.get(0);
        for (Integer integer : myList) {
            if (integer>max) {
                max = integer;
            }
        }
        return max;
    }

    public static void sortMinToMax(List<Integer> myList) {
        List<Integer> myNewList = new ArrayList();
        while(!myList.isEmpty()) {
            Integer min = myList.get(0);
            for (Integer integer : myList) {
                if (integer < min) {
                    min = integer;
                }
            }
            myNewList.add(min);
            myList.remove(min);
        }
        System.out.printf("\nSorted ArrayList (min-to-max) : %s",myNewList);
    }

    public static void findSimpleNum(List<Integer> myList) {
        for (Integer n:myList) {
            Integer num = Math.abs(n);
            int count=0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num%i==0){
                    count++;
                    break;
                }
            }
            if(count==0) {
                System.out.printf("%s ",n);
            }
        }
    }
}
