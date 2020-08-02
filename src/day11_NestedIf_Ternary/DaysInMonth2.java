package day11_NestedIf_Ternary;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int montn =1;
        boolean validN =(montn>=1&&montn<=12);
        boolean day28 =(montn==2);
        boolean day30 =(montn==4||montn==6||montn==9||montn==11);
        String result ="";

        if(validN){if(day28){result ="28 day";}else
            if(day30){result="30 day";} else {result = "31 day";}




        }else {result="invalid";}
        System.out.println(result);



    }



}

