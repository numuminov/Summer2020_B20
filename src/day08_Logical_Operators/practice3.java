package day08_Logical_Operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class practice3 {

    public static void main(String[] args) {

        String fullName = "John Smith ";
        int age = 31;
        String CitizenOf = "USA";
        String CitizenOf2 = "Holland";
        boolean EligibleAge = age >= 18;
        boolean EligibleCitzen = CitizenOf == "USA" || CitizenOf2 == "USA";
        boolean EligibleForVote = EligibleAge && EligibleCitzen;
        System.out.println(fullName +"Eliginble for vote "+ EligibleForVote);


    }
}