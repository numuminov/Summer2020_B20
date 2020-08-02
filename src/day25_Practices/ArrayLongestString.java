package day25_Practices;

public class ArrayLongestString {
    public static void main(String[] args) {
        String [] arr ={"Anam","Nicolasiy","Amir","Nurjannet"};
/*
        int maxLength=arr[0].length();//4

        for(String each: arr){
            if(each.length()>maxLength){maxLength=each.length();}



        }
        System.out.println(maxLength);

        for(String each: arr){


            if(each.length()==maxLength){
                System.out.println(each);
            }
        }







    }
}

 */
        int longest=arr[0].length();

        for(String each: arr){

            if(each.length()>longest){longest=each.length();}
        }

        for(String each: arr){

            if(each.length()==longest){System.out.println(each);}
        }

    }

}
