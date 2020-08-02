package day30_CustomMethods;

import java.util.Arrays;

public class recap {
    public static void maxNum(int num,int num2){
        /*
        wamrmup tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
methods: function. grouping code fragments

        Access-modifier  Specifier  return-type  methodName(parameter){
                statements;
        }
        Access-modifer: public
        specifier: static
        parameter: any dataType
        methodName (Mandatory): can be any name
        return-Type(Mandatory) : void,  DataType

         */
        if(num==num2){
            System.out.println("Equal");
            return;
        }
        if(num>=num2){
            System.out.println(num+" is max");
        }else{
            System.out.println(num2+" is max");
        }



    }
    public static void printDesc(int[] arr){
        Arrays.sort(arr);
        for( int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
    public static void combine2Arrays(int[] arr1, int[] arr2){
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


        System.out.println(Arrays.toString(arr3));
    }

    public static void positivOrNegativ(int num){
        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+ " is negative");
        }else {
            System.out.println("zero");
        }




    }

    public static void main(String[] args) {
        maxNum(123,123);
        int arr[]={6,7,4,3,2,8,9,0,45,-98};
        int arr2[]={6,7,4,3,2,8,9,0,45,-98};

        printDesc(arr);
        combine2Arrays(arr2,arr2);
        positivOrNegativ(6);
        int arr3[]={6,7,-4,3,2,-8,9,0,45,-98};
        for (int each: arr3){
            positivOrNegativ(each);
        }

    }

}
