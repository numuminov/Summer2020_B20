package day19_ForLoop;

public class reverseString {
    public static void main(String[] args) {
        String str = "Cybertek is good";
        //String reult =""+str.charAt(str.length()-1)+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        String result="";
        for (int i=str.length()-1; i>=0;i--){
            result+=str.charAt(i);}


        System.out.println(result.toLowerCase());
    }
}
