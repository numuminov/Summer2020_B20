package day24_Arrays;

public class uniqueNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6,5,3,7,8,8,7,9};

        for (int j = 0; j <= arr.length - 1; j++) {

            int num1 = arr[j];
            int count = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                int each = arr[i];
                if (each == num1) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(num1);
            }
        }
    }
}