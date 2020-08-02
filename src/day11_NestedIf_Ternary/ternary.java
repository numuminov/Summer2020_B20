package day11_NestedIf_Ternary;

public class ternary {
    public static void main(String[] args) {
        int  num=100;
        String result ="";

        if(num%2 ==0){result ="even";}
        else{result = "odd";}
        System.out.println(result);


        String result2 = (num%2 ==0)? "even":"odd";
        System.out.println(result2);

        System.out.println("==============");

        int num1 = 10;
        int num2 = 20;
        int max =0;
        if(num1>num2){max=num1;}
        else {max=num2;}
        System.out.println(max);


        System.out.println("==============");

        int maxx =(num1>num2) ? num1 : num2;
        System.out.println(maxx);
        System.out.println("====================");
        int age = 23;
        boolean eligible=false;
        if(age>21){eligible=true;}
        else {eligible=false;}
        System.out.println(eligible);
        // can vote or not

        boolean eligibile =(age>=21) ? true:false;
        System.out.println(eligible);


        int age2 = 56;
        boolean elig = (age2>=18)? true:false;
        System.out.println(elig);



    }
}
