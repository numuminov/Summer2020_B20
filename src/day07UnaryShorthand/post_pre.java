package day07UnaryShorthand;

public class post_pre {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a); // 11
        System.out.println(a); //11
        System.out.println("++++++++++++++++++++");

        int b =10;
        System.out.println( b++);//
        System.out.println(b);
        System.out.println("=====================");

        int c =25;
        int d = c++;
        System.out.println( c);
        System.out.println(d);
        System.out.println("++++++++++");

        int e = 25;
        e++;

        System.out.println(e);

        int x=8;
        int y = x--;// y=8
        System.out.println(y);
        System.out.println(x);
        System.out.println("+++++++++++++++++++++");
        int A=1;
        A= -A-- +A++/ -A--*--A; // -1
        System.out.println(A);

        int B = 50;
        B = --B +B++ +B-- + B++; // 49 + 49 +50 + 49
        System.out.println(B);
        System.out.println(B);

        int X= 4;
        int Y = X*4 -X++;
        System.out.println(Y);












    }


}

