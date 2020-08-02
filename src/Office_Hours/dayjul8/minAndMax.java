package Office_Hours.dayjul8;

import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int min=999999999;
        int max=-999999999;

        int i =1;

        while (i<=5){
            System.out.println("number");

            int n =scan.nextInt();
            if(n<min){min=n;}

            if(n>max){max=n;}







            i++;
        }
        System.out.println(min);
        System.out.println(max);





    }}
