package day08_Logical_Operators;

public class IF_statement {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;

        if (a > b) {
            System.out.println(a + "is larger");
        }
        if (a < b) {
            System.out.println(b + "is larger");
        }
        if (a == b) {
            System.out.println(a + "are equal" + b);
        }
        System.out.println("=======================");

        boolean BreakTime = true;
        if(BreakTime==true){
            System.out.println("Take 15 min break");
        }
        if (BreakTime ==false) {
            System.out.println("Keep stadying");}
            System.out.println("=====================");



        boolean Corona = false;
        if(Corona==true){
            System.out.println(" Stay at home");
            System.out.println(" buy hand sanitizer");}else{
            System.out.println("Nothing");}





    }}
