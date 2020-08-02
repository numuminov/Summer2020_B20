package day23_Arrays;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String[] months ={"jan","feb","mar","apr","mai","jun","jul","aug","sep",
                "okt","nov","dec"};
        Scanner scan =new Scanner(System.in);
        System.out.println("enter num");
        int n = scan.nextInt();
        System.out.println(months[n-1]);


    }
}
