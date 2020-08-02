package day16_String;

import java.util.Scanner;

public class substring_prac {
    public static void main(String[] args) {
        /*
        1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("word");// apple
        String w1= scan.next();

        System.out.println("word2");//banana
        String w2 =scan.next();

        String result= w1.substring(1).concat(w2.substring(1));
        System.out.println(result);
        String str ="I like to drink pepsi";
        String drink = str.substring(16);
        System.out.println(drink);
        String action = str.substring(10,15);
        System.out.println(action);

    }
}
