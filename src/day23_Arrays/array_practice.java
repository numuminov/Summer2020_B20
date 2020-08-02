package day23_Arrays;

public class array_practice {
    public static void main(String[] args) {
       // String students="Muhtar","Nadir";

        String[]students={"cyberrtec","Muhtar","Nadir","Aasia"};

        String name1 = students[3];
        System.out.println(name1);

        int[] scores={85,70,95,90,100};
        String[ ] name ={"Mike","Adam","tony","John","amy"};
/*
        System.out.println(name[0]+":"+scores[0]);
        System.out.println(name[1]+":"+scores[1]);
        System.out.println(name[2]+":"+scores[2]);
        System.out.println(name[3]+":"+scores[3]);
        System.out.println(name[4]+":"+scores[4]);



 */
    for(int i=0;i<=4;i++){
        System.out.println(name[i]+":"+scores[i]);



    }

        System.out.println("=======================");

    String[] classMates = new String[5];
    classMates[0]="Fatih";
    classMates[2]="Hazel";
    classMates[1]="Viorel";
        classMates[3]="Elk";
        classMates[4]="Ahmed";
        for(int i=0;i<=4;i++){
            System.out.println(classMates[i]);


        }




    }
}
