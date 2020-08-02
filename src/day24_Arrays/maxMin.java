package day24_Arrays;

import java.util.Scanner;

public class maxMin {
    /*

    2. write a program that asks user how many numbers he
     wants to enter, and get all the user inputs and store
      them into an array variable, and then write the program
       that can return maximum and minimum numbers

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers to enter");
        int numbofNumb= scan.nextInt();
        int [] arr = new int[numbofNumb];

        for(int i=0;i<numbofNumb;i++){
            System.out.println("Enter your number");
            int num =scan.nextInt();
            arr[i]=num;
        }int max=arr[0];
        int min=arr[0];




        for(int i=0;i<=arr.length-1;i++)

        { if(arr[i]<min){min=arr[i];}

        if(arr[i]>max){
            max=arr[i];
        }



        System.out.println(max);
        System.out.println(min);
    }

}}
