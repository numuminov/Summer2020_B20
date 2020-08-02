package day23_Arrays;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        String[] days = new String[7];
        days[6]="sunday";
        days[1]="tuesday";
        days[4]="fraiday";
        days[3]="Thursday";
        days[2]="wednesday";
        days[5]="saturday";
        days[0]="monday";

        for(int i =0; i<=days.length-1;i++){

            System.out.println(days[i]+" ");


        }


        System.out.println();
        System.out.println("=================");
        System.out.println("Enter num");
        int n =scan.nextInt();
        System.out.println(days[n-1]);
    }


}
