package Office_Hours.july7_14;

public class findUnique {
    public static void main(String[] args) {
        String str = "ABABCDDEFFGHHIJJK";
        /*

        String expectedResult = "";  // "C"
        // str = "ABABC";
        for(int j = 0; j < str.length() ; j++){

            char ch = str.charAt(j); // A B A B C
            int count = 0 ; // frequency of ch

            for(int i = 0; i < str.length(); i++){  //helps us to calculate the frequency of ch and assign it to count
                char each =  str.charAt(i);
                if(each == ch){
                    count+=1;
                }
            }

            if(count == 1){ // unique
                expectedResult += ch;
            }

        }



        System.out.println(expectedResult);

         */

        String expR="";
        for( int j=0; j<=str.length()-1;j++){
        char a=str.charAt(j);
        int count=0;


        for(int i =0;i<=str.length()-1;i++){
            char a1 =str.charAt(i);
            if(a1==a){
                count++;
            }

        }

        if(count==1){expR+=a;}}

        System.out.println(expR);


    }}
