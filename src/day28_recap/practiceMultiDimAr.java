package day28_recap;

public class practiceMultiDimAr {
    public static void main(String[] args) {


    /*
    int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
                3 2 1
                87654
                131211109
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

     */

    int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

    for(int i =arr2D.length-1;i>=0;i--)
    { int[] eacharr=arr2D[i];
    for(int each:eacharr){
        System.out.print(each+" ");

    }

        System.out.println();

    }
    for(int i=0;i<=arr2D.length-1;i++){
        int[] arr1D =arr2D[i];
        for(int j=arr1D.length-1;j>=0;j--){
            int each=arr1D[j];
            System.out.print(each+" ");

        }
        System.out.println();


    }
/*

        for(int j=arr2D.length-1;j>=0;j--){
            int[] eacharr=arr2D[j];
            for(int i=eacharr.length-1;i>=0;i--){
                int each=eacharr[j];
            }

System.out.print(each+" ");

        }

        System.out.println();

 */


        for(int i = arr2D.length-1; i >=0 ; i-- ){
            int[] arr1D = arr2D[i];
            for(int j=arr1D.length-1; j >= 0; j-- ){
                System.out.print(arr1D[j]+" ");
            }
            System.out.println();
        }
}}
