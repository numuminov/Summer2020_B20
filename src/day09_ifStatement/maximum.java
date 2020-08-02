package day09_ifStatement;

public class maximum {
    public static void main(String[] args) {
        int a=500;
        int b = 2000;
        int c=1000;
        boolean aIsMax = a>b && a>c;
        boolean bIsMax= aIsMax==false && b>c;
        boolean cIsMax =aIsMax==false && bIsMax==false;
        //!aIsMax && !bIsMax;= !(aIsMax&&bIsMax)
        int max =0;// we want to assign the maximum number to variable max

        if(aIsMax){max=a;      }
        if(bIsMax){max=b;    }
        if(cIsMax){max=c;    }
        System.out.println(max +" is max number");



    }
}
