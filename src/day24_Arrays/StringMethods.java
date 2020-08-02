package day24_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // String to char array
        String str ="ABCDEHGYTUTIRO";
        char [] ch= str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("=============");

        String str1 ="DCEBA";
        String str2= "ADCBE";
        char [] ch1 = str1.toCharArray();
        char [] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r1 = Arrays.equals(ch1,ch2);
        System.out.println(r1);
        System.out.println("=======================");

        //split string;

        String sent = "I Love programming Languae";

        String [] words = sent.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
        System.out.println();
        System.out.println("==============");


        String s= "JAVA";
        String[] arr =s.split("");
        System.out.println(Arrays.toString(arr));

        char [ ] c =s.toCharArray();
        System.out.println(Arrays.toString(c));



    }
}
