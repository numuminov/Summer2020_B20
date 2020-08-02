package day14_Recap;
import java.util.Scanner;


public class NextLineVSothers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enetr yuour fiull name");
        String fullName = input.nextLine();
        System.out.println(fullName+" is " + age + " year old");

    }


}
