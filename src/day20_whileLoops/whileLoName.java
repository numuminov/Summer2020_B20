package day20_whileLoops;

public class whileLoName {
    public static void main(String[] args) {
        int i =0;

        while (i<=10){
            System.out.println("Name");
            i++;
        }
        System.out.println("================");
        String str = "cybertek";
        String tes="";
        int e =str.length()-1;
        while (e>=0){
            tes+=str.charAt(e);



            e--;
        }
        System.out.println(tes);


    }
}
