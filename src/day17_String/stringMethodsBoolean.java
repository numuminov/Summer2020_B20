package day17_String;

public class stringMethodsBoolean {
    public static void main(String[] args) {
        // EQUALS

        String s1= "Cat";
        String s2 = new String("Cat");
        String s3 = new String("Cat");

        System.out.println(s1==s2);// false
        System.out.println(s1.equals(s2));//true


        System.out.println(s2==s3);//false
        System.out.println(s2.equals(s3));//true

        String s4= "java";
        String s5="Java";

        System.out.println(s4.equals(s5));//false
        System.out.println(s4.equalsIgnoreCase(s5));//true


        String s6= "MuhTaR";
        String s7 ="muhtar";
        System.out.println(s6.equalsIgnoreCase(s7));

        // IS EMPTY cheks if the length of string is 0

        String str ="   ";
        String str1 = "";

        System.out.println(str.isEmpty());//false
        System.out.println(str1.isEmpty());//true

        str =str.trim();
        System.out.println(str.isEmpty());//true

        //CONTAINS method

        String str3= "Java, C#, Pyton, Ruby, C++";
        System.out.println(str3.contains("Java"));//true
        System.out.println(str3.contains("java"));//false
        System.out.println(str3.toLowerCase().contains("java"));//true

        String str4 = "ABCD";
        System.out.println(str4.contains("D"));//true

        //STARTS WITH && ENDS WITH
         String str5= "Cybertek School";

        System.out.println(str5.startsWith("Cybe"));//true

        System.out.println(str5.startsWith("E")||str5.startsWith("C"));//true

        System.out.println(str5.endsWith("l"));//true







    }
}
