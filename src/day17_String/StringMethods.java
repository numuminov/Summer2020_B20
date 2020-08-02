package day17_String;

public class StringMethods {
    public static void main(String[] args) {

        //CHAR AT method

        String str ="cybertek";
        //           01234567
        char ch1=str.charAt(1);
        System.out.println(ch1);

        String str2 = "Cybertek";
        str2= str2+" "+"School";
        System.out.println(str2);

        //length()

        String str3= "Cybertek";

        int l  =str3.length();
        System.out.println(l);
        // last index is length-1!!!
        System.out.println("last index is" + (l-1));

        char ch2 = str3.charAt(l-1);

        System.out.println(ch2);

        //uppercase lowercase

        String str4 ="cybertek";
        str4= str.toUpperCase();//Cybertek

        String str5= "JAVA";
        str5=str5.toLowerCase();
        System.out.println(str5);


        //TRIM

        String str6 = "         Cybertek     ";
        System.out.println(str6);

        str6=str6.trim();
        System.out.println(str6);

        //SUBSTRING

        String str7 = "I like Java language";
        //                     78910 +1
        String word =str7.substring(7,10+1);//java
        System.out.println(str7);
        System.out.println(word);

        String word2= str7.substring(12); //or 12,str.length()
                                            //language
        System.out.println(word2);

        // INDEX OF & LAST INDEX OF methods
        String str8 = "Hello batch20, have a wonderful day";

        int i1=str8.indexOf("w");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));

        System.out.println(i1);
        int i2 = str8.indexOf(", w")+2;// to find second w
        //last index of

        String str9= "Java Java Java";

        int i4 =str9.lastIndexOf("J");
        int i5= str9.indexOf("J");
        int i6 =str9.indexOf( " J");
        System.out.println(""+i4+i5+i6);


        // REPLACE & REPLACE FIRST

        String s1 = "I like Java, Java is a progrmming language";
         s1 = s1.replace("Java", "C#");

        String s2 = "I like Java, Java is a progrmming language";
        s2 = s2.replaceFirst("Java","C#");

        String s3 ="I like Java, Java is a progrmming language";
        s3=s3.replace("Java is","C# is");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


















    }
}
