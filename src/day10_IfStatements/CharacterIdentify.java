package day10_IfStatements;

public class CharacterIdentify {
    public static void main(String[] args) {
        char character = 34;
        boolean isAlphabetic = (character>=65 && character<=90)||(character >=97 && character <=122);
        //                          uppercase letters                 lovercase letters
        boolean isDigit = character>= 48 && character<=57;

        boolean specialChar = !isAlphabetic && !isDigit;
        //isAlphabetic==false && isDigit==falce
        String SpecialCharacter = "";

        String digit = "";
        if (isDigit){digit =character+" is digit";}else {digit=character+"is not digit";}
        System.out.println(digit);


        if (isAlphabetic){System.out.println( character + " is alphabetic character");}else
        {System.out.println( character + " is not alphabetic character");}
         if(specialChar){SpecialCharacter=character+ " is spesial character";}else{SpecialCharacter=character+ " is non special character";}
        System.out.println(SpecialCharacter);



    }
}
