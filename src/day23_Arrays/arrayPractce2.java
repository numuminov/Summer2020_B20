package day23_Arrays;

public class arrayPractce2 {
    public static void main(String[] args) {
        String veggi[]= new String[6];
        int price []= new int[6];

        veggi[0]="Onions";
        veggi[1]="tomat";
        veggi[2]="potat";
        veggi[3]="greenpep";
        veggi[4]="lettuce";
        veggi[5]="cucum";

        price[0]=2;
        price[1]=3;
        price[3]=6;
        price[2]=7;
        price[4]=2;
        price[5]=1;
        for(int i=0;i<=5;i++){
            System.out.println(veggi[i]+":" +price[i]);}





    }
}
