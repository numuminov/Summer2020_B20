package day16_String;

import java.util.Scanner;

public class String_lengthChek {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
                /*
                 write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
*/

        String str= "abced";
        /*
        if (str.length()==0){
            System.out.println("empty");}else if(str.length()>3){
            System.out.println(str.substring(str.length()-3));}
        else{
            System.out.println(str);}

*/
        String result =(str.length()==0)?"empty"
                :(str.length()>3)?str.substring(str.length()-3)
                :str;
        System.out.println(result);


        System.out.println("======================");

        String str1 = "abcd";
        String str2 = "ab";
        String str3 = "ab";
        if(str1.length()==str2.length()&&str1.length()==str3.length()){
            System.out.println("all samelength");}else if(str1.length()!=str2.length()&&str1.length()!=str3.length()&&str2.length()!=str3.length()){
            System.out.println("All diff");}else{
            System.out.println("Not Same nor Different lengths");





    }

}}
