package day08_Logical_Operators;

public class Triangle {
    public static void main(String[] args) {
        double ang1 = 10;
        double ang2 = 60;
        double ang3 = 110;

        boolean valid = ang1+ang2+ang3 ==180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");
        }
        if(invalid){


            System.out.println("Invalid Triangle");
        }





    }






}

