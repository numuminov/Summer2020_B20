package day19_ForLoop;

public class SunOfEvenAndOdd {
    public static void main(String[] args) {
        //SUM OF EVEN NUMBERS 1-100
        int sumOfEven =0;
        //for(int i =0; i<=100; i+=2){sumOfEven +=i;}
           for(int i=0;i <=100;i++){if(i%2==0){sumOfEven+=i;}}





            System.out.println(sumOfEven);
        System.out.println("==================");
        //sum of odd numbers
        int sumOfOdd=0;

         //for(int i=1;i<=99;i+=2){sumOfOdd+=i;}

        for(int i=0;i<=100;i++){if(i%2!=0)
        sumOfOdd=sumOfOdd+i;}

        System.out.println(sumOfOdd);












}}
