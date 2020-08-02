package day10_IfStatements;

public class grade {
    public static void main(String[] args) {
        int score = 108;
        String grade = "";
        if(score>=90 && score <=100){grade = "A";}
        else if(score>=80 && score<=89){grade ="B";}
        else if(score>=70 && score<=79){grade ="C";}
        else if(score>=60 && score <=69){grade ="D";}
        else if (score<=59 && score>=0){grade ="F";}else{grade = "Invalid number";}


        System.out.println(grade);
    }
}
