package day08_Logical_Operators;

public class practice {
    public static void main(String[] args) {
        //
        int age = 19;
        String CitizenShip = "USA";

        boolean elgibleToVote = age >= 18 && CitizenShip == "USA";
        System.out.println(elgibleToVote);

        String firstName = "Aaron";
        String lastname = "Daniel";
        String fullName = firstName+" "+lastname;
        int age1 = 25;
        String CitizenShip1 = "Canada";
        boolean eligibleToVote1 = age1>= 18 && CitizenShip1 == "USA";

        System.out.println( fullName + " eligible  to vote " + eligibleToVote1 );

        //||

        boolean r8 = true == !false || false == true;

        System.out.println(r8);

        boolean r9 = !false == false || true == !false;
        System.out.println( r9);






    }
}
