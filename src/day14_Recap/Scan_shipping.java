package day14_Recap;

import java.util.Scanner;

public class Scan_shipping {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Buiding number: ");

        int bnum = input.nextInt();
        input.nextLine();
        System.out.println("Enere your stret name: ");
        String street = input.nextLine();
        System.out.println("City name");
        String city = input.nextLine();
        System.out.println("state");
        String state=input.next();
        System.out.println("zip");
        int zip = input.nextInt();
        input.nextLine();
        System.out.println("Full name");
        String fulln = input.nextLine();
        System.out.println("\n" + "Ship to:"+fulln+"\n"+
                bnum+" "+street+"\n"+city+", "+state+" "+zip);






    }
}
