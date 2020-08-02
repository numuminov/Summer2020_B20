package day29_CustomMethods;

public class returnKeyword {  //calculate grade

    public static void main(String[] args) {
        grade(101);

        grade(400);
    }



    public static void grade(int score){
        if(score<0||score>100){
            System.out.println("inv");
            return;
        }
        char garde=(score>=90)?'A':(score>=80)?'B':(score>=70)?'C':
                (score>=60)?'D':'F';
        System.out.println("grate is:"+garde);

    }
}
