package day11_NestedIf_Ternary;

public class ternary_practice2 {
    public static void main(String[] args) {
        int n = -27;// ? if : else
        String result = (n>0)? "Positive" : (n<0)? "negative": "Zero";
        System.out.println(result);
        System.out.println("==================");
        //compare
        int  q=10;
        int w=20;
        String result2 =(q>w)?" q is greater":(q<w)? "w is greater":" q is equal";
        System.out.println(result2);

    }
}
