package day24_Arrays;
import java.util.Arrays;

public class arraysUtility {
    public static void main(String[] args) {
        int [  ] arr ={1,2,3};

        System.out.println(Arrays.toString(arr));
        String s1 =Arrays.toString(arr);
        System.out.println(s1);
        String names[]={"muhtar","saim","nadir","asia"};
        System.out.println(Arrays.toString(names));
        // in order to print array variable
        //we must conver it to array
        System.out.println("===================");

        int num[]={5,6,4,8,9,30,5};
        Arrays.sort(num);  //[4,5,6,8...]
        System.out.println(Arrays.toString(num));
        System.out.println("max n: "+num[num.length-1]);
        System.out.println("min n: "+num[0]);

        String student[]={"mehdi","elkem","mee","trump"};

        Arrays.sort(student);

        System.out.println(Arrays.toString(student));

        //Arrays equals
        System.out.println("=====================");

        int [ ] arr1 = {1,2,3};
        int [] arr2 ={1,2,3};

        boolean r1 =Arrays.equals(arr1,arr2);// true
        System.out.println(r1);

        int [] arr3 ={2,1,3};
        boolean r2 =Arrays.equals(arr2,arr3);
        System.out.println(r2);

        Arrays.sort(arr2);
        Arrays.sort(arr3);

        boolean r3 =Arrays.equals(arr2,arr3);
        System.out.println(r3);


    }


}
