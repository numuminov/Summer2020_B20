package day13_Scanner;

import java.util.Scanner;

public class Nextline_practice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your bil number: ");
        int bnum = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your stret name");
        String strnam= scan.nextLine();
        System.out.println(bnum+strnam);

    }
}

