package day25_Practices;

public class ArrayShortestStringForEch {
    public static void main(String[] args) {


        String [] arr ={"Anam","Nicolas","Amir","Nurjannet"};

        int minLength=arr[0].length();

        for(String each: arr){

            int l =each.length();//4 8 4 8

// just founded shortest strigs and now we compare short number with
            //strings
            if(l<minLength){minLength=l;}
        }
        for(String each: arr){
            if(each.length()==minLength){
                System.out.println(each);
            }


        }


    }
}
