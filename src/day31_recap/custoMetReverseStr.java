package day31_recap;

public class custoMetReverseStr {
    public static void main(String[] args) {
        String s ="madam";

    }

    public static void  reverse1(String str){


        String expRes= "";
        for(int i =str.length()-1;i>=0; i--){

            expRes+=str.charAt(i);
        }
        System.out.println(expRes);
    }

    public static String reverse2(String str) {
        String expRes="";
        for(int i =str.length()-1;i>=0; i--) {

            expRes += str.charAt(i);

        }
    return expRes;

    }

}


