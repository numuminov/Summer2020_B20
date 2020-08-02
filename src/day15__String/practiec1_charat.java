package day15__String;

import java.util.Scanner;

public class practiec1_charat {
    public static void main(String[] args) {
        //enter user last name and first name
        // print initials
        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name");
        String fname =scan.next();// cybertek
        char fin= fname.charAt(0);

        System.out.println("Entr your lasst name:");
        String lname = scan.next();
        char lin=lname.charAt(0);
        System.out.println("You initials is: "+fin+"."+lin);

    }
}
