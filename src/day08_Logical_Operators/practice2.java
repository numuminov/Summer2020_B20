package day08_Logical_Operators;

public class practice2 {
    public static void main(String[] args) {
        String firsN = "Conor;";
        String lastN = "McNugget";
        String FullN = firsN+lastN;



        int age =21;
        String citiz1 = "USA";
        String citiz2 = "France";
        boolean eligibleAge = age >= 18;

        boolean usCitizen = citiz1 =="USA" || citiz2 == "USA";

        boolean eligibleToVote = eligibleAge && usCitizen;
        System.out.println(eligibleToVote);






    }
}
