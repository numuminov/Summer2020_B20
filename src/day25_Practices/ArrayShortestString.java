package day25_Practices;

public class ArrayShortestString {
    public static void main(String[] args) {
        String [] arr ={"Anam","Nicolas","Amir","Nurjannet"};

        int minLength=arr[0].length();

        for(int i=0;i<=arr.length-1;i++){

            int l =arr[i].length();//4 8 4 8
// just founded shortest strigs and now we compare short number with
            //strings
            if(l<minLength){minLength=l;}
        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i].length()==minLength){
                System.out.println(arr[i]);
            }


        }




    }
}
