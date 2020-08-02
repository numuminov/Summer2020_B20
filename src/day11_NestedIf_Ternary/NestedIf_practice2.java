package day11_NestedIf_Ternary;

public class NestedIf_practice2 {
    public static void main(String[] args) {
        int day = 5;
        boolean validNumber = day >= 1 && day <= 7;
        String resul = "";
        if (validNumber) {
            if (day == 7) {
                resul = "Sunday";
            } else if (day == 6) {
                resul = "Saturday";
            }else if (day == 5) {
                resul = "Friday";
            }else if (day == 4) {
                resul = "Thursday";
            }else if (day == 3) {
                resul = "Wednesday";
            }else if (day == 2) {
                resul = "Tuesday";
            }else {resul = "Monday";
            }


        } else {
            resul = "Invalid";
        }
        System.out.println(resul);
        resul=(day==7)?"Sunday":(day==6)?"Saturday":(day==5)?"Friday":
                (day==4)?"Thursday":(day==3)?"Wednesday":(day==2)?"Tuesday":
                        "Monday";
        System.out.println(resul);

    }
}
