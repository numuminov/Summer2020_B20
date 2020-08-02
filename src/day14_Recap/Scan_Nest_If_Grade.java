package day14_Recap;

import java.util.Scanner;

public class Scan_Nest_If_Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        double score =input.nextDouble();
        input.close();

        String res= "";
        if(score>=0&&score<=100){if(score>=90){res= "exellent";} else if(score>=80){res="great";} else if(score>=70){res="good";}else if(score>=60){res="passed";}else{res="foul";}}else{res="Invalid score";}

        System.out.println(res);



    }
}
