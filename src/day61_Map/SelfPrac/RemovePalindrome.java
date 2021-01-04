package day61_Map.SelfPrac;

import com.sun.xml.internal.fastinfoset.util.CharArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch20"};

        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(words ) );

        Iterator<String> it=list.iterator();

        while (it.hasNext()){
            String reverse="";
            String name=it.next();
            for (int i = name.length()-1; i >=0 ; i--) {
                reverse+=name.charAt(i);

            }

            if (reverse.equalsIgnoreCase(name)){it.remove();}

        }

        System.out.println("list = " + list);
    }
}
class remPal{


    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
list.addAll(Arrays.asList("bir","ikki","uch","Ukku","sut","tut"));

Iterator <String> it =list.iterator();
while (it.hasNext()){
    String reverse="";
    String words=it.next();
    for(int i=words.length()-1;i>=0;i--){
        reverse+=words.charAt(i);



    }
    if(words.equalsIgnoreCase(reverse)) it.remove();



}

        System.out.println("list = " + list);




    }

}