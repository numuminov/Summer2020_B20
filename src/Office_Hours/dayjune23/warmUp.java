package Office_Hours;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int sum=0;
        for(int i=1; i<=500;i+=10){



            System.out.println("Enter a number");
            int num =scan.nextInt();
            sum+=num;
            if(num<0);{break;}


        }
        System.out.println(sum);}}