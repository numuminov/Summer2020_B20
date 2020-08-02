package day29_CustomMethods;

public class UniqElement {
    public static void unique(String[] arr){
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

        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr ={"A","B","C","B"};
        unique(arr);


    }
}
