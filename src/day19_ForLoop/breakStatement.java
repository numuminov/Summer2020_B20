package day19_ForLoop;

public class breakStatement {
    public static void main(String[] args) {
        for(int i=0; i<5;i++){
            System.out.println("Hello");
            break;
        }
        for(int i = 10; i<=50; i+=10) {

            if(i==30){break;}// 10 20


            System.out.print(i+" ");
           // if(i==30){break;} 10,20,30




        }
        System.out.println("=============");

        for (int x=1000; x>100; x-=100){
            if(x==500){break;}

            System.out.print(x +" "); }







    }
}
