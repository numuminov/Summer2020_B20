package Office_Hours.dayjul8;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int max = -9999999;
        int j=1;
        while (j<=5) {

            System.out.println("numb");
            int n = scan.nextInt();

            if (n > max) {
                max = n;
            }


            j++;
        }
        System.out.println(max
        );




    }
}
