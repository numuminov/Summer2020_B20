package Office_Hours.july7_15;


public class freqFromString {
    public static void main(String[] args) {
        String str ="catcatcat";
        int count =0;
        while (str.contains("cat")){
            count++;
            str=str.replaceFirst("cat","");

        }
        System.out.println(count);
    }
}
