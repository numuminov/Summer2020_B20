package day19_ForLoop;

public class practice {
    public static void main(String[] args) {
        //print odd numbers between 1-100 divizible 3&5


        for(int i=1;i<=99;i+=2){if(i%3==0&&i%5==0)
            System.out.print(i+" ");

        }
        for(int i =0; i<=100;i++){if(i%2 !=00)
        {if(i%3==0&&i%5==0){
            System.out.print(i +" ");}}}
        System.out.println("");

        System.out.println("============================");

//print even numbers between 1-100 divizible 3&5
        for(int i = 0;i<=100; i++){if(i%2==0){if(i%15==0)
            System.out.print(i+"  ");}}
        System.out.println();


        for(int i = 0;i<=100; i++){if(i%2==0&&i%15==0){
            System.out.print(i+"  ");}}













    }
}
