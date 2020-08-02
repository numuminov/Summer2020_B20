package day15__String;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        String school ="CyberTek";
        school=school.concat(" School");// SyberTek school
        System.out.println(school);
        Scanner scan = new Scanner(System.in);
        System.out.println("first name");
        String firstname= scan.next();
        System.out.println("last name");
        String lastnme= scan.next();
        String fulln =firstname.concat(lastnme);//
        System.out.println("your fm ".concat(fulln));


    }
}
