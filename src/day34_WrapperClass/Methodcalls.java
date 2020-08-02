package day34_WrapperClass;
import Library.Util;

import java.util.Arrays;

public class Methodcalls {
    public static void main(String[] args) {
        Integer [] arr ={1,2,3,4};
        Integer [] arr2 ={5,6,7,8};
        Integer[] arr3=Util.combine2Arrays(arr,arr2);
        int [] arr4=new int[8];
        System.out.println("arr4"+Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr3));

        int i=9;
        int o=8;
        char [] ch ={'A','B','C','D','U'};
        char[] ch2= Util.sortDesc(ch);
        System.out.println(ch2);
    }

}
