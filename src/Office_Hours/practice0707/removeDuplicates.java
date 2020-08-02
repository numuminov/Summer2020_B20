package Office_Hours.practice0707;

public class removeDuplicates {
    public static void main(String[] args) {
        String str= "nalan";//nal
        String result ="";
        for(int i=0; i<=str.length()-1;i++){
            String s =""+ str.charAt(i);
            if(result.contains(s)){continue;}else {result+=s;}


        }
        System.out.println(result);

    }
}
