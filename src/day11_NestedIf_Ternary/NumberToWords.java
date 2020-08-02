package day11_NestedIf_Ternary;

public class NumberToWords {
    public static void main(String[] args) {

        int num =0;

        String res ="";

        if(num==0){res = "zero";} else
            if (num ==1){res = "one";}
            else
            if(num==2){res ="two";}else if(num==3){res ="three";}
        if (num==4){res ="four";}else if(num==5){res = "five";}
        if(num ==6){res = "six";}else if (num==7){res = "seven";}
        if (num ==8){res = "eight";} else if (num ==9) {res = "nine";}
        else{res = "invalid";}

        System.out.println(res);


    }
}
