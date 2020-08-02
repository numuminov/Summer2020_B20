package day21_loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int max=-2000000;

        for(int i=10;i<=50;i+=10){

        System.out.println("Entr number");
        int num =scan.nextInt();

        if(num>max){max=num;}

        }

        System.out.println(max);

    }
}
