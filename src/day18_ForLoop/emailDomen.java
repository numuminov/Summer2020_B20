package day18_ForLoop;

public class emailDomen {
    public static void main(String[] args) {

        String email = "test@yahoo.com";
        int index1 =email.indexOf("@");
        int index2= email.indexOf(".");

        String domain = email.substring(index1+1,index2);
        System.out.println(domain);


    }
}
