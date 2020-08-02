package day15__String;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("first num");
        String firnam =scan.next().toUpperCase();
        System.out.println("lastnam");
        String lastn= scan.next().toUpperCase();

        String fulln= firnam+" "+lastn;
        System.out.println(fulln);

    }
}
