package day13_Scanner;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you annual salary: ");
        int salary = input.nextInt();
        System.out.println("Entr your state tax rate");
        double stateTaxRate =input.nextDouble();
        double stateTax = salary*stateTaxRate;
        System.out.println("Enter federal tax rate: ");
        double fedTaxRate = input.nextDouble();
        double fedTax = salary*fedTaxRate;
        double salaryAfterTax = salary-stateTax-fedTax;
        System.out.println("Your salary: $ "+salary);
        System.out.println("Your state tax $ "+stateTax);
        System.out.println("Federal tax $" +fedTax);
        System.out.println( "Your salary after tax: $ "+ salaryAfterTax);



    }





}
