package day24_Arrays;

import java.util.Arrays;

public class forEachLoop {
    public static void main(String[] args) {

        int[ ] arr= {1,2,3,4,5,6,7,8};
        for (int i =1; i <=arr.length-1;i++);{}

        System.out.println("================");


        for(int each :arr){
            System.out.print(each+" ");

            System.out.println("==============");

            String[] names= {"football","handball","golf","tennis","velosport"};
            for(String each1: names){
                System.out.println(each1);
            }


        }


    }
}
