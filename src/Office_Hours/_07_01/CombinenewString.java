package Office_Hours._07_01;

import java.util.Scanner;

public class CombinenewString {

    public static void main(String[] args) {

        /*
        String str1= "boom";
        String str2 ="mboom";
        char ch1= str1.charAt(str1.length()-1);
        char ch2 = str2.charAt(0);
        if(ch1==ch2){
            System.out.println(str1.concat(str2.substring(1)));}else {
            System.out.println(str1.concat(str2));}

         */
        Scanner scan = new Scanner(System.in);
        String s1= scan.next();
        String s2= scan.next();

        String s11= s1.substring(s1.length()-1);
        String s22= s2.substring(0,1);

        if(s11.equalsIgnoreCase(s22)) System.out.println(s1.concat(s2.substring(1)));
        else System.out.println(s1+s2);








    }


}
