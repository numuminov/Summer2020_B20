package day19_ForLoop;

public class palindromTests {
    public static void main(String[] args) {
        String str= "kayak";
        String reversedSt= "";
        for( int i =str.length()-1; i>=0; i--)
        {reversedSt+=str.charAt(i);}

            System.out.println(str.equals(reversedSt));}


        }


