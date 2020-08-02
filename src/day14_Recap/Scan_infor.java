package day14_Recap;
import java.util.Scanner;


public class Scan_infor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gend= input.next();
        System.out.println("Enter your age");
        int age= input.nextInt();
        input.nextLine();
        System.out.println("Country name ");
        String country = input.nextLine();
        System.out.println("Enter your zip");
        int zip = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name");
        String fulln =input.nextLine();





    }
}
