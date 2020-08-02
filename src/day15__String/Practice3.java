package day15__String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Sentence");

        String sent= scan.nextLine();
        int lastind=sent.length()-1;

        System.out.println(sent.charAt(0));
        System.out.println(sent.charAt(lastind));



    }
}
