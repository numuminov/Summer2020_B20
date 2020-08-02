package day28_recap;

public class warmup {
    public static void main(String[] args) {
        /*
        write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3

         */
        String str = "JavajavaJAVA";
        String word = "java";

        str = str.toLowerCase();
         word = word.toLowerCase();

        int count =0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.contains(word)){
                count++;
                str=str.replaceFirst(word,"");
            }

        }

        System.out.println(count);
        /*
        write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output:
                        2
            MUST USE for each loop

         */

        String[] arr ={"Java", "C#", "Python", "Java"};
        String word2= "java";
        int count2=0;

        for(String each: arr){
            if(each.equalsIgnoreCase("java")){
                count2++;

            }
        }
        System.out.println(count2);





    }
}
