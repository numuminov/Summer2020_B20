package day25_Practices;
import java.util.Arrays;
public class array1to100even {
    public static void main(String[] args) {
        int[] numbers = new int[100];
       /*
        numbers[0]=1;
        numbers[1]=2;

        */
        for(int i =0;i<=numbers.length-1;i++){

            numbers[i]=i+1;
        }

        System.out.println(Arrays.toString(numbers));

        for(int each:numbers){
            if(each%2!=0){continue;}
            System.out.print(each+" ");
        }    }}