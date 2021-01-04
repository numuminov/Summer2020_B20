package day61_Map.SelfPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEvens {
    public static void main(String[] args) {
        List<Integer>arr=new ArrayList<>();
        arr.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15));

       Iterator <Integer> it=arr.iterator();

       while (it.hasNext()){
           if(it.next()%2==0){it.remove();}
       }
        System.out.println("arr = " + arr);
    }
}
