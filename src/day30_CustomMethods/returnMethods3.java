package day30_CustomMethods;

import java.util.Arrays;

public class returnMethods3 {
    public static void main(String[] args) {
        int [] arr= {2,4,5,678,43,12,567,-9};
        int num=max(arr);
        System.out.println(num);

    }
    public static int max(int [] arr){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        return max;

    }


}
