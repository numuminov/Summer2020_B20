package day09_ifStatement;

public class minimum {
    public static void main(String[] args) {
        double a =100;
        double b = 200;
        double c = 300;
        boolean aIsMin = a<b && a<c;
        boolean bIsMin = !aIsMin && b<c;
        boolean cIsMin = !aIsMin && !bIsMin;

        double min=0;

        if(aIsMin){min=a;}
        if(bIsMin){min=b;}
        if(cIsMin){min=c;}
        System.out.println(min + " is min number");


    }
}
