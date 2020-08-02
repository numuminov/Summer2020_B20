package day29_CustomMethods;

import sun.security.util.ObjectIdentifier;

//age,citizen,name

public class eligibleVote {
    public static void eligtoAlc(boolean hasID, int age){
        if(hasID&&age>=21){
            System.out.println("you are elig");
        }else{
            System.out.println("not elig");};


    }
    public static void calculator(double num, char oper, double num2 ){
        switch (oper){
            case '+':
                System.out.println("addition"+(num+num2));
                break;
            case '-':
                System.out.println("subst"+(num-num2));
                break;
            case '*':
                System.out.println("multip"+(num*num2));
                break;
            case '/':
                System.out.println("div"+(num/num2));
                break;
            case '%':
                System.out.println("remain"+(num%num2));
                break;
            default:
                System.out.println("inval");








        }






    }
    public static void  vote(String name,int age, boolean citizen, String presidName ){
boolean eligibleToVote= age>=18&&citizen==true;
if(eligibleToVote){
    System.out.println(name+"is elig to voet for"+ presidName);
}else {
    System.out.println(name+"no elig");
}



    }

    public static void main(String[] args) {
        vote("john",23,true, "ji" );
        eligtoAlc(true,54);
        calculator(6,'*',7);

    }

}
