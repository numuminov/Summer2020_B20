package day24_Arrays;

public class averageNum {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};

        int sum=0;
        for(int i =arr.length-1;i >=0;i-- ){
            sum+=arr[i];



        }
        double ave=sum/(double)arr.length;
        System.out.println(sum);
        System.out.println(ave);
    }
}
