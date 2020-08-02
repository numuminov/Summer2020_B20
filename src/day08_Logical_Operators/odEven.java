package day08_Logical_Operators;

public class odEven {
    public static void main(String[] args) {
        int num = 100;
        boolean even = num%2 ==0;
        boolean odd = !even;
        if (even){
            System.out.println(num + " is even number");

        }
        if(odd){
            System.out.println(num+" is odd number");
        }
    }
}
