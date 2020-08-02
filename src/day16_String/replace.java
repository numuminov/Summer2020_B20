package day16_String;

public class replace {
    public static void main(String[] args) {
        String email ="cybertek@gmail.com";
        email= email.replace("gmail","yahoo");
        System.out.println(email        );
        String word ="I like to learn Java, Java is cool, Java is fun";
        word =word.replace("a, Java","a, C#");
        word =word.replace("Java ", "Pyton ");
        System.out.println(word    );

        String s2 = "I like leaRn Java, we aRe enjoying Java";//r
        s2=s2.replace('R', 'r');
        System.out.println(s2);
        //REPLACE FIRST replaceFirst
        String s3 ="I like to drink tea and tea";
        s3= s3.replaceFirst("tea","cola");
        System.out.println(s3);
        String s4= " I like watch movies and sitcoms";
        s4= s4.replace("movies and ","");
        System.out.println(s4);



        String s5 = "I like stay in cybertek, we are learning java";
        int r1=s5.indexOf("r");
        int r2= s5.indexOf("ar");
        int r3 =s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(s5.charAt(19));
        System.out.println(r3);

        //LAST INDEX OF lastIndexOf()

        String s6= "java is a programmin language, and java is fun";
        int r6 = s6.lastIndexOf("f");
        System.out.println(r6);

        String s7 = "Java";
        int a1= s7.indexOf("A");//negative number
        System.out.println(a1);



        String s8= "jevelery";
        double r8= s8.indexOf("y");
        System.out.println(r8);
        // ERROR! char ch8= s8.charAt(r8);

















    }
}
