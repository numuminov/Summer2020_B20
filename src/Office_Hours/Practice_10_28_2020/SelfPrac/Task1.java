package Office_Hours.Practice_10_28_2020.SelfPrac;

import java.util.*;

public class Task1 {
    /*
    * Create a method will take an Integer ArrayList and remove any duplicates values. Return an ArrayList of unique elements.
==========================================
* Create a method that will accept a String ArrayList and return the largest Palindrome String from it
    => Assume there is no Strings with the same length and there will be at least one element 
==========================================
[ Amazon 1st round question]
* Write a program to identify the frequency of duplicates words in a string. Print duplicates words and their frequency.
==========================================
Let's say there is a table on a web page and you sorted it. This table was given to you as a Set of Strings. Verify if the the table was sorted appropriately
==========================================
Let's say there is a dropdown menu that was given to you as a Set of Strings and you also got an ArrayList of String outlining the expected dropdown menu options. Verify if the dropdown menu result is matching the expected result by the requirements (given ArrayList)
==========================================
Extra in case we have time: 
* Create a method that will accept a String and returns a version that removes duplicate instances of any character
Ex: removeDup("AAABBBCCCD") ==> ABCD
* Create a method that will accept a String and returns only characters that are duplicates
Ex: keepDup("AABCCCCDEEEFFG") ==> BDG

     */
    public static ArrayList<Integer> removeDublicates(ArrayList<Integer> arr){

        Set<Integer> set=new LinkedHashSet<>();
        set.addAll(arr);
        arr.clear();
        arr.addAll(set);
        return arr;
    }
/*

    public static String biggestPalindrome(ArrayList<String> arr2){

        ArrayList<String>newList=new ArrayList<String>();

        for (String words : arr2) {
            String wordsReversed="";
            for (int i = words.length()-1; i >=0 ; i--) {
            wordsReversed+=words.charAt(i);

            if(words.equalsIgnoreCase(wordsReversed)){newList.add(words);}

            }


        }
        int max=0;

        for (String each:newList
             ) {if(each.length()>max){}

        }


    return }

 */


    
    public static void main(String[] args) {
        
        ArrayList<Integer> google=new ArrayList<>();
        google.addAll(Arrays.asList(2,3,4,5,6,7,8,9,0,6,5,4,3,21,2,3,9));
        
        
        
        removeDublicates(google);
        System.out.println("google = " + google);
        
        
    }
}
