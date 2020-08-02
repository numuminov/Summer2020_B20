package day25_Practices;

public class ArrayFirstThreeChars {
    public static void main(String[] args) {
        /*

        5. Write a program that will take five Strings and save them
         into an array called arr. and  Use for loop to print out
          the first three letter of each element of arr, one per
          line.You can assume that every element of arr is at
          least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
         */

        String[] words= {"apple","banana","Strewb","Lava","pytonn"};
        for(int i=0; i<=words.length-1;i++){



        System.out.println(words[i].substring(0,3));}

        System.out.println("====================");

        for(String each: words){

            System.out.print(each.substring(0,3)+" ");

        }



    }
}
