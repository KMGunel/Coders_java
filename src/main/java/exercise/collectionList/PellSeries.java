package main.java.exercise.collectionList;

import java.util.ArrayList;
import java.util.List;

public class PellSeries {
    public static void main(String[] args) {
        pellSeries();
    }

    public static void pellSeries(){
        List<Integer> pellSeries=new ArrayList<>();
        pellSeries.add(0);
        for (int i = 1,j=1; i <= 25;i++ ) {
            pellSeries.add(j);
            j = (j*2) + (pellSeries.get(i-1));
        }
        System.out.printf("Pell Series ( 1 to 25 ) : %s",pellSeries);
    }
}
