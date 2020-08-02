package day11_NestedIf_Ternary;

public class ternary_practce1 {
    public static void main(String[] args) {
        int age = 23;
        String cizn ="USA";

        String result = "";
        if(age>=18&& cizn == "USA"){ result ="Can vote";}
        else{result= "Cannot Vote";}
        System.out.println(result);
        System.out.println("=================");

        String result2 =(age>=18&& cizn == "USA") ? "Can Vote": "Can not Vote";
        System.out.println(result2);
        System.out.println("==================");

        int n1 =1;
        int n2=2;
        String r= (n1==n2) ? "Equal": "Not equal";
        System.out.println(r);

        System.out.println("=====================");

        int num = 100;

        String reees = (num>0)? "positive":(num<0)? "negative":"Zero";
        System.out.println(reees);




    }
}
