package day22_NestedLoop;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*

        usern: cyber
        pass: tek123
         */
        System.out.println("Username");
        String u=scan.next();

        System.out.println("pass");
        String p= scan.next();

        int attempt =0;

        while (!(u.equals("cyber")&&p.equals("tek123"))){
            if(attempt==3){
                System.out.println("acc locked");
                System.exit(0);
            }
            System.out.println("invalid, pls reenter");
            System.out.println("username");
            u=scan.next();
            System.out.println("pass");
            p=scan.next();
            attempt++;

        }


        System.out.println("Logged in");






    }

}
