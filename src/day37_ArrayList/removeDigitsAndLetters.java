package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class removeDigitsAndLetters {
    public static void main(String[] args) {
        /*
        write a program that can remove digits and letters for an ArrayList of characters
            list: {a,b,c,3,4,5,6,&,%,@,#,*}
            output: {&,%,@,#,*};

         */
        ArrayList<Character> char01=new ArrayList<>();
        char01.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));
        char01.removeIf(p-> Character.isDigit(p)||Character.isLetter(p));

        System.out.println(char01);
        ArrayList<Character> list = new ArrayList<>();
        list.addAll( Arrays.asList('a', '1', 'b', '2', 'c', 'd', '$', '#', '@', '?', '*', '&')   );


        ArrayList<Character> digits = new ArrayList<>();  // [1,2]
        digits.addAll( list );
        digits.removeIf( p ->  !Character.isDigit(p)  );  // if the character is not digit, then remove it from thelist

        System.out.println("digits: "+digits);



        ArrayList<Character> letters = new ArrayList<>(); // [a,b,c,d]
        letters.addAll(list);
        letters.removeIf( p -> !Character.isLetter(p) ); // if the character is letter, then remove it from the list

        System.out.println("letters: "+letters);



        ArrayList<Character> specialChar = new ArrayList<>(); // ['$', '#', '@', '?', '*', '&']
        specialChar.addAll(list);

        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("Special Characters: "+specialChar);









    }

}


