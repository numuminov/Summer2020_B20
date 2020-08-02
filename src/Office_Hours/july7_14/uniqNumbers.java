package Office_Hours.july7_14;

public class uniqNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 1, 4, 5, 6, 7, 8, 9};
        /*

        for(int b: arr){

            int count = 0; // for the frequency of num in the arr
            for( int each : arr ){ // for counting the frequency of num
                if(each == b){
                    count++;  }
            }
            if(count == 1){
                System.out.print(b);

    }
}
         */
        for(int e=0;e<=arr.length-1;e++) {
            int q = arr[e];
            int count = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                int w = arr[i];
                if (q == w) {
                    count++;
                }
            }


            if (count == 1){
                System.out.print(q);
            }

        }
    }}
