package day29_CustomMethods;

public class warmUpUniqs {
    public static void main(String[] args) {
        String[] arr ={"A","B","C","B"};

        for(String a: arr){
        int count =0;


        for(String each: arr) {
            if (a.equals(each)) {
                count++;
            }


        }
        if(count==1){
            System.out.println(a);
        }}
    }
}
