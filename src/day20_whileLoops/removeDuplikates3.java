package day20_whileLoops;

import java.util.Scanner;

public class removeDuplikates3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entr wd");
        String str =scan.next();
        String res= "";

        for (int i=0;i<=str.length()-1;i++){

            String s = ""+str.charAt(i);//aabb

            if(!res.contains(s)){

                res+=s;
            }


        }
        System.out.println(res);


        for (int i=0;i<=str.length()-1;i++){

            String s = ""+str.charAt(i);//aabb

            if(res.contains(s))
            {continue;}{

                res+=s;
            }


        }
        System.out.println(res);

    }
}
