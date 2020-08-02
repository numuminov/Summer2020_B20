package day25_Practices;

public class countOddEven {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10,11};

        int countEven=0;
        int countOdd=0;
        String even="";
        String odd="";

        for(int each: num){
            if(each%2==0){countEven++; even+=" "+each;}else{countOdd++;}
        }
        System.out.println(countEven);
        System.out.println(even);
        System.out.println(countOdd);
    }
}
