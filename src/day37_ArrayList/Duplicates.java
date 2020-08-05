package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,7,4,5,3,1,6,8,5,3,6,2,9,7));
        list.removeIf(p-> Collections.frequency(list,p)==1);
        System.out.println(list);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Canada","Bob",
                "David","Lan","Abida","Ebrahim","Farida"));

        names.removeIf(p-> p.toLowerCase().charAt(0)!=p.charAt(p.length()-1));
        System.out.println(names);
        System.out.println("=======================");
        ArrayList<Integer> grades=new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,75,35,47));

        ArrayList<Integer> gradesA=new ArrayList<>(); //90-100

        ArrayList<Integer> gradesB=new ArrayList<>();//80-90
        ArrayList<Integer> gradesC=new ArrayList<>();//70-80
        ArrayList<Integer> gradesD=new ArrayList<>();//60-70
        ArrayList<Integer> gradesF=new ArrayList<>();//0-60

        gradesA.addAll(grades);

        gradesA.removeIf(p-> p<90);
        int A =gradesA.size();
        System.out.println(A+" students got A grade: "+gradesA);

        gradesB.addAll(grades);

        gradesB.removeIf(p-> p<80||p>=90);
        int B =gradesB.size();
        System.out.println(B+" students got B grade: "+gradesB);

        gradesC.addAll(grades);

        gradesC.removeIf(p-> p<70||p>=80);
        int C =gradesC.size();
        System.out.println(C+" students got C grade: "+gradesC);

        gradesD.addAll(grades);

        gradesD.removeIf(p-> p<60||p>=70);
        int D =gradesD.size();
        System.out.println(D+" students got D grade: "+gradesD);

        gradesF.addAll(grades);

        gradesF.removeIf(p-> p>60);
        int F =gradesF.size();
        System.out.println(F+" students fail: "+gradesF);


    }
}
