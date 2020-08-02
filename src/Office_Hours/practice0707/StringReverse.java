package Office_Hours.practice0707;

public class StringReverse {
    public static void main(String[] args) {
        String str="Batch20";
        //          0123456

        str.charAt(6);//'0'
        str.charAt(5); // '2'
        str.charAt(4);
        str.charAt(3);
        str.charAt(2);
        str.charAt(1);
        str.charAt(0);
        String result ="";


        for(int i=6;i>=0;i--){
          result=result+  str.charAt(i);




        }
        System.out.println(result);

        String result2="";
        int index =str.length()-1;
        while (index>=0){
            result2=result2+str.charAt(index);




            index--;
        }
        System.out.println(result2);

    }
}
