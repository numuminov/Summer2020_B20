package Office_Hours.july7_13;

public class frequenChar {
    public static void main(String[] args) {
        String str ="OOPQQ";//O2P1Q2

        //remove dub OPQ
        String nonDub="";//compare str&nonDub
                          //O("Ox")PQ("Qx")
        //start remove dublicate
        for(int i=0;i<=str.length()-1;i++){

            String s =""+str.charAt(i);// O O P Q Q
            if (! nonDub.contains(s)){// if the char is not alredy
                //exist then we concate
                nonDub+=s;    //OPQ
            }
        }
        String result ="";
        for(int j=0;j<=nonDub.length()-1;j++) {


            char ch1 = nonDub.charAt(j);//o0
            int count = 0;//12
            for (int i = 0; i <= str.length() - 1; i++) {//counting freq
                char each = str.charAt(i);//O O P Q Q
                if (each == ch1) {
                    count += 1;
                }
            }


            result += "" + ch1 + count;}

            System.out.println(result);






    }
}
