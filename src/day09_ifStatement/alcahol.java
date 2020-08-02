package day09_ifStatement;

public class alcahol {
    public static void main(String[] args) {
        int age = 26;
        boolean  hasID = true;
        String result = "";


        boolean eligible = hasID && age>=21;
        if (eligible == true){result = "eligible to buy alcohol";
        };
        if (eligible== false) {
            result="You cant buy alcohol";
        };
        System.out.println(result);

    }

}
