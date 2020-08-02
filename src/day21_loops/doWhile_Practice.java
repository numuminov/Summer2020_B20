package day21_loops;

public class doWhile_Practice {
    public static void main(String[] args) {
        int i=1;

        do{
            System.out.print(i+" ");


            i++;
        }while (i<=20);
        System.out.println();
        System.out.println(i);
        System.out.println("==================");
        char ch ='Z';


        do{

            System.out.print(ch+" ");
            ch--;
        }while (ch>='A');



    }
}
