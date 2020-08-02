package day17_String;

public class Pool_Heap {
    public static void main(String[] args) {
        String s1 ="Cybertek";//Sring pool
        String s2 = "Cybertek";
        String s3 = new String("Cybertek");//heap
        String s4=new String("Cybertek");//heap
        String s5 ="cybertek";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s5==s2);





    }
}
