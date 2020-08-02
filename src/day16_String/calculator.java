package day16_String;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("num");
        double w1= scan.nextDouble();

        System.out.println("num");
        double w2 =scan.nextDouble();

        System.out.println("operator");
        char oper = scan.next().charAt(0);
        boolean valid = oper=='*'||oper=='/'||oper=='%'||oper=='-'||oper=='+';
        if(valid){
            switch (oper){
                case'*':
                    System.out.println(w1*w2);
                    break;
                case'/':
                    System.out.println(w1/w2);
                    break;
                case'%':
                    System.out.println(w1%w2);
                    break;
                case'+':
                    System.out.println(w1+w2);
                    break;
                default:
                    System.out.println(w1+w2);









            }




        }else{
            System.out.println("Invalid op-r");
        }
    }
}
