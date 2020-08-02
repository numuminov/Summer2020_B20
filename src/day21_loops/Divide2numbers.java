package day21_loops;

public class Divide2numbers {
    public static void main(String[] args) {
        int a=20;
        int b =3;
        int count =0;
        if(b==0){
            System.out.println("Invalid input");
            System.exit(0);

        }

        while(a>=b)
        {a-=b;

        count ++;}


        System.out.println(count +" with a reminder "+a);

    }
}
