package day13_Scanner;

import java.util.Scanner;

public class scanner_Next {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your company name");
        String companyname =scan.next();
        System.out.println( "Your company name: "+ companyname);
    }
}
