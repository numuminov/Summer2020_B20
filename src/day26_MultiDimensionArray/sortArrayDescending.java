package day26_MultiDimensionArray;
/*
write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have an array that contains the desending order of the original array
default values:

    Integer: 0
    Deciimals: 0.0
    boolean: false
    String: null

 */

import java.util.Arrays;

public class sortArrayDescending {
    public static void main(String[] args) {
        int[] arr={10,11,8,9,12,5,15};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));




        int[] desc=new int[arr.length];
        int k= arr.length-1;
        for (int i=0; i<=desc.length-1;i++){

            desc[i]=arr[k];
                    k--;
        }


        System.out.println(Arrays.toString(desc));

    }
}
