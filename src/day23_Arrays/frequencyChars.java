package day23_Arrays;


public class frequencyChars {
    public static void main(String[] args) {

        String str ="ABAB";
        String nonDup="";
        String res="";

        for(int i =0;i<=str.length()-1;i++){

            String  c= ""+str.charAt(i);//ABAB
            if(!nonDup.contains(c)){nonDup+=c;}
        }

    System.out.println(nonDup);

        for(int j=0; j<=nonDup.length()-1;j++){
        char c =nonDup.charAt(j);
        int count=0;
        for(int i=0;i<=str.length()-1;i++){

            if(str.charAt(i)==c){

                count+=1;
            }}

        res+=""+c+count;
        }

        System.out.println(res);

}}
