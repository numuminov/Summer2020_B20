package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class uniques2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>(); // {2}

        for( Integer each: list){
            if( Collections.frequency(list, each)  == 1){
                uniques.add(each);
            }
        }


        System.out.println(uniques);




    }


}