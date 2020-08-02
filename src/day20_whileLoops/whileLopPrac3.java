package day20_whileLoops;

import java.util.Scanner;

public class whileLopPrac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass ="Cybertec";
        System.out.println("Enter pass");
        String input =scan.nextLine();
        while (!input.equals(pass)){
            System.out.println("please reenter");
            input =scan.nextLine();
        }
        System.out.println("Loggd in");
    }
}
