package day07UnaryShorthand;

public class shorthandOp {
    public static void main(String[] args) {
        int a =100;
        a*= a; //a =a*a;
        System.out.println(a);

        int b =2;
        b*=3;
        System.out.println(b);
        int c =300;
        c -= 100;
        System.out.println(c);

        //additional assignment

        int z = 300;
        z+=200;
        System.out.println(z);

        String schoolName ="Sybertek";
        schoolName+=" School";
        System.out.println(schoolName);

        int j = 100;
        j/=2;
        System.out.println(j);

         int l = 10;
         l %=2;
        System.out.println(l);
        int ll = 198;
        ll%=2;
        System.out.println(ll);
        System.out.println(10/3.0);




    }
}
