package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1= 100;
        long l1 = s1; // implicit casting
        System.out.println(l1);
        System.out.println("_______________________");
        int n1 = 1000; //explicit casting
        short sh1= (short)n1;
        System.out.println(sh1);
        double m1 = 34.5;
        float f1 = (int)m1;
        System.out.println(f1);
        long r1 =-500;
        short fg = (short)r1;
        System.out.println(fg);






    }
}
