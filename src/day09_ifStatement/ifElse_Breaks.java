package day09_ifStatement;

public class ifElse_Breaks {
    public static void main(String[] args) {

        String itsBreakTime = "yes";
        if(itsBreakTime== "yes"){
            System.out.println( "Take 15 min of break");
        }else {
            System.out.println("Continue");}


        int a = 100;
        int b = 200;
        if(a>b){
            System.out.println(a+" is greater");
        }else {
            System.out.println(b+ " is greater");
        }
    }
}
