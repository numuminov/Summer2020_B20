package day29_CustomMethods;

public class palindromTest {
    public static void palindrom(String word){

        String reverse="";
        for(int i=word.length()-1;i>=0;i--){

            reverse+=word.charAt(i);
        }
        System.out.println(reverse.equalsIgnoreCase(word));

    }

    public static void main(String[] args) {
        palindrom("gplc");
        palindrom("level");
    }
}

