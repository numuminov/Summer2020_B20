package day23_Arrays;

public class task {
    public static void main(String[] args) {
        int[] arr={10,20,3,4,5,6,7,-10,-100,300,400};
        int max=arr[0];
        int min=arr[0];
        for(int i =1;i<=arr.length-1;i++){if(arr[i]>arr[0]){max=arr[i];}

        }


        System.out.println(max);
        for(int i =0;i<=arr.length-1;i++){if(arr[i]<arr[0]){min=arr[i];}



        }
        System.out.println(min);
    }
}
