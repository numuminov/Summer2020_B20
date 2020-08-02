package day12_Switch_Scanner;

public class nestIf_Agegrupp {
    public static void main(String[] args) {
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
