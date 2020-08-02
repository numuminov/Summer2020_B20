package day15__String;

public class substring {
    public static void main(String[] args) {
        String sent ="Jave is fun";

        String word=sent.substring(0,6);
        System.out.println(word);

        String word2= sent.substring(8,11);
        System.out.println(word2);
        System.out.println("===============");
        String sentence = "I like Movies and TV Series";
        String word3 =sentence.substring(7,12);
        System.out.println(word3);
        String firstName= "NURULLO";
        String fchar =firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length());
        firstName=fchar.toUpperCase()+rest.toLowerCase();
        System.out.println(rest);
        System.out.println(firstName);
        System.out.println(sent.charAt(3));

    }
}
