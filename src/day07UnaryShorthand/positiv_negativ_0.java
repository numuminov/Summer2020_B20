package day07UnaryShorthand;

public class positiv_negativ_0 {
    public static void main(String[] args) {
        int num = 77;
        boolean res1 = num >0;
        boolean res2 = num < 0;
        boolean res3 = num == 0;
        boolean res4 = num%2 == 0;

        System.out.println( num + " is positive number " + res1);
        System.out.println( num + " is negative number " + res2);
        System.out.println( num + " is zero " + res3);
        System.out.println(num +" is even number "+ res4);


    }
}
