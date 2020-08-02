package day20_whileLoops;

import java.util.Scanner;

public class factorialNumber2 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        double result=1;
        for(int i =scan.nextInt();i>=1;i--){
            result*=i;
        }
        System.out.println(result);
    }
}
