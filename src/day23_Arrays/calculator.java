package day23_Arrays;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while (true) {

            System.out.println("number2numbrs");
            double num1 = scan.nextDouble();

            double num2 = scan.nextDouble();
            System.out.println("enter math oper");
            char o =scan.next().charAt(0);

            double result = (o=='+')?num1+num2:(o=='-')?num1-num2:(o=='*')?num1*num2
                    :(o=='/')?num1/num2:(o=='%')?num1%num2:0;
            System.out.println(result);

            System.out.println("do you want to continue?");

            String a = scan.next().toLowerCase();

            while (!(a.equals("yes")||a.equals("no"))){
                System.out.println("Invalid ansver enter yes or no");
                System.out.println("Do you wat to continue?");
                a=scan.next().toLowerCase();
            }
            if(a.equals("no")){break;}

        }









    }
}

