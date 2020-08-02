package day30_CustomMethods;

import java.util.Arrays;

public class returnMethods4 {

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        for( int each: arr1){
            arr3[i]=each;
            i++;
        }
        for(int each: arr2){

            arr3[i]=each;
            i++;
        }


        return arr3;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={1,2,3};
        int [] arr3=combine2Arrays(arr,arr2);
        System.out.println(Arrays.toString(arr3));
    }

}
