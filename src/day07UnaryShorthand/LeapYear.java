package day07UnaryShorthand;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean result = year %4 == 0;
        System.out.println(year + " is leap year: " + result);

    }
}
