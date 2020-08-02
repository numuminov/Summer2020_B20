package day30_CustomMethods;
import Library.Util;

import java.util.Arrays;

public class methodCalls {
    public static void main(String[] args) {
        String str ="aafjgungjysesrdfvcmkgighysrs";
        String str2=Util.removeDup(str);
        System.out.println(str2);
       String s= Util.frequencyOfChars("aaddggttrree");
        System.out.println(s);
        String d =Util.uniques("huthutrustrusjiu");
        System.out.println(d);
        int [] arr={1,3,5,6,7};
        int [] arr2={1,3,5,6,7};
        int [] arr3=Util.combine2Arrays(arr,arr2);
        System.out.println(Arrays.toString(arr3));


    }

}
