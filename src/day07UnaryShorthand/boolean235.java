package day07UnaryShorthand;

public class boolean235 {
    public static void main(String[] args) {
        short num1 = 30;
        boolean result = num1 % 2 ==0;
        boolean result2 = num1% 3 ==0;
        boolean result3 = num1 % 5 ==0;

        System.out.println( "Is " + num1 + "divisable to 2" + result);
        System.out.println( "Is " + num1 + "divisable to 3" + result2);
        System.out.println( "Is " + num1 + "divisable to 5" + result3);
    }
}
