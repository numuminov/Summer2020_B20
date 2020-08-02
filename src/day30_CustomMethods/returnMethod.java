package day30_CustomMethods;

public class returnMethod {
    public static void addit(int a,int b){
        int sum= a+b;
        System.out.println(sum);
    }
    public static int addit2(int a, int b){
        int sum= a+b;

        return sum;
    }


    public static void main(String[] args) {
        addit(4,5);
        addit2(6,9);
    }
}
