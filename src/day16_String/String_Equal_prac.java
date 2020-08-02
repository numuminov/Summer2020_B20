package day16_String;

import java.util.Scanner;

public class String_Equal_prac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("are you eploeed");
        String ans= scan.next();
        if(ans.equalsIgnoreCase("yes")){
            System.out.println("Emploeed");}else{
            System.out.println("Not emp");}


        String str ="I like to learn java programming language";

        System.out.println(str.contains("pyton"));//false
        System.out.println(str.contains("java"));//true


        //StartsWith
        String d1= "Muhtar";
        System.out.println(d1.startsWith("J"));//false
        System.out.println(d1.startsWith("Mu"));//true
        System.out.println(d1.toLowerCase().contains("mu"));








    }
}
