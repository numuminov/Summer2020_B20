package day24_Arrays;

public class unique2 {
    public static void main(String[] args) {
        String str ="aabccd";
        String unique ="";

        for(int j=0;j<=str.length()-1;j++){

        char ch1 = str.charAt(j);
        int count =0;
        for(int i=0;i<str.length();i++){
            char each =str.charAt(i);
            if(ch1==each){
                count+=1;
            }


        }

        if(count==1){unique+=ch1;}}
        System.out.println(unique);

}}
