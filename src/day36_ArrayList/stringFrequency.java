package day36_ArrayList;

public class stringFrequency {
    public static void main(String[] args) {


        String f = "i love java java is fun";
        String s = "java";
        int count =0;

        for (int i = 0; i <=f.length()-s.length();i++){
            if(f.substring(i,i+s.length()).equals(s))
{count++;}


        }
    }
}