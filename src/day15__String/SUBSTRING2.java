package day15__String;


public class SUBSTRING2 {
    public static void main(String[] args) {


        String lastName = "RaMaZaN";
        String firstChar = lastName.substring(0, 1);
        String remaining = lastName.substring(1,lastName.length());
        System.out.println(firstChar.toUpperCase()+remaining.toLowerCase());
    }
}