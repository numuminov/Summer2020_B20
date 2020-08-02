package day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String firstName="JoHNsOn";
        String lastName="JorDAn";
        String fullName;

        fullName=Util.formatFullName(firstName,lastName);
        System.out.println(fullName);

        String uniques=Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);

        String reversedName=Util.reverse(fullName);
        System.out.println(reversedName);

int [] a={1,2,3};
int n=23;
int[]b=Util.addElement(a,n);
        System.out.println(Arrays.toString(b));


    }
}
