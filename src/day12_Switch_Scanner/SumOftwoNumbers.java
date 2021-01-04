package day12_Switch_Scanner;
import java.util.Scanner;
public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = scan.nextInt();
        System.out.println("Enter your second number: ");
        int b = scan.nextInt();

        int sum = a+b;
        System.out.println( "Sum of those two numbers are: " +  sum );

        Scanner scan1 =new Scanner(System.in);
        System.out.println("qalaysiz");

        String javob = scan1.next();

        switch (javob){

            case "yaxshi":
                System.out.println("zorku");
                break;
            case "yomon":
                System.out.println("bay-bay");
                break;

            default:
                System.out.println("aaa");
        }


    }

}
