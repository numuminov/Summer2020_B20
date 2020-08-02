package day11_NestedIf_Ternary;

public class nestedIf {
    public static void main(String[] args) {
        /*

        90-100
        80-89


         */
        int score = 1;
        String result ="";

         if (score>=0 && score <=100) { if(score >=90){result ="A";}
         else if(score>=80){result ="B";}else if(score>=70){result ="C";}
         else if(score>=60){result = "D";}else {result="F";}



         }else {result = "invalid";}
        System.out.println(result);


        System.out.println("=============================");


        /*
        int

         */




    }
}
