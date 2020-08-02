package day15__String;

public class practice_lenght {
    public static void main(String[] args) {
        String name ="Cybertek";
        //lenght ==> int

        int l = name.length();
        System.out.println(l);
        int lastIndnumber= name.length()-1;
        //last ind == lenght -1
        System.out.println(lastIndnumber);
        char ch=name.charAt(lastIndnumber);
        System.out.println(ch);


    }
}
