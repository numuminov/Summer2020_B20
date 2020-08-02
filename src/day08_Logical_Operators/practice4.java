package day08_Logical_Operators;

public class practice4 {
    public static void main(String[] args) {
        int b = 2;
        boolean res = ++b==2|| --b==2 && --b==2;
        //             3         2        1

        System.out.println(res);//true&false=false

        int c= 5;
        boolean r2 = c++ ==6 || c--==5|| c==5;
        //             5        6        5
        System.out.println(r2);










    }
}
