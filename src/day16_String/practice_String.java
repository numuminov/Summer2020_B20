package day16_String;

import java.util.Scanner;

public class practice_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("word");
        String w1= scan.next();

        System.out.println("word2");
        String w2 =scan.next();

        boolean result =w1.length()==5&&w2.length()==5;

        /*

        if(result){
            char ch1= w1.charAt(w1.length()-1);
            char ch2= w2.charAt(0);
            if(ch1==ch2){
                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }
            }


        else{
            System.out.println("need to be exact 5 length");
        }
*/
        if(result){
            System.out.println("5");





        }else{
            System.out.println("need 5");
        }




    }
}
