package day12_Switch_Scanner;

import java.util.Scanner;

public class scan_prac3 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1= first.nextInt();
        Scanner sec = new Scanner(System.in);
        System.out.println("Enter your second number");

        int num2 = sec.nextInt();
        int  result = num1+num2;
        System.out.println(result);




    }
}
