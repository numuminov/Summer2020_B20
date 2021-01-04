package day61_Map.SelfPrac;

import java.util.*;

public class RemoveDub {
    public static void main(String[] args) {
        String [] arr={"bir","ikki","uch","tort","bir","ikki","uch","tort"};

        List<String>list=new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        Set<String>list2=new LinkedHashSet<>(list);
        System.out.println("list2 = " + list2);
        list.clear();
        list.addAll(list2);
        System.out.println("list = " + list);
    }
}
