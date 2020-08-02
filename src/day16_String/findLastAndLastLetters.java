package day16_String;

import java.util.Scanner;

public class findLastAndLastLetters {
    /*
    Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word");
        String word =scan.next();
        char fnum = word.charAt(0);
        char lnum= word.charAt(word.length()-1);
        System.out.println(fnum==lnum);
scan.close();

    }
}
