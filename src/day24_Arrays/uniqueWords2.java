package day24_Arrays;

public class uniqueWords2 {
    public static void main(String[] args) {
        String[] words ={"c#","c#","Java","Pyton","Piton","C++"};

        for(String each: words){


        String s=each;
        int count =0;
        for(String b:words){
            if(s.equals(b)){count++;}
        }
        if(count==1){
            System.out.println(s);
        }








    }







}}
