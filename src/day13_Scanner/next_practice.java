package day13_Scanner;
import java.util.Scanner;


public class next_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String FirNam = scan.next();

        System.out.println("Enter your last name");
        String Lastnm =scan.next();
        System.out.println(FirNam+" "+Lastnm);
    }
}
