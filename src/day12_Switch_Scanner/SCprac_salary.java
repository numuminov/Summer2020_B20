package day12_Switch_Scanner;
import java.util.Scanner;


public class SCprac_salary {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = sal.nextDouble();
        System.out.println("Enter your hours do you work a week");
        int wkhour= sal.nextInt();
        int tothour = wkhour*52;
        double hourlrat = salary/tothour;
        System.out.println("Your hourly rate is $" +hourlrat);






    }
}
