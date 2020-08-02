package day12_Switch_Scanner;

public class warmup {
    public static void main(String[] args) {
        int n=1;
        int m=2;
        int o=3;
        String f=(n>m&&n>o)?"n is bigger":(m>n&&m>o)?"m is bigger":"o is bigger";
        System.out.println(f);

        int age = -7;
        if(age>0&&age<150){if(age<21){
            System.out.println("Teenager");
        }else if(age>=21&&age<55){
            System.out.println("Adult");
        }else {
            System.out.println("Senior");
        }}else{
            System.out.println("Invalid age");
        }
    }
}
