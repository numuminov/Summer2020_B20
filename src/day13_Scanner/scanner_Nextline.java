package day13_Scanner;

import java.util.Scanner;

public class scanner_Nextline {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();
        System.out.println( "Enter your address:");
        String address = scan.nextLine();
        System.out.println(fullName+address );


    }
}
