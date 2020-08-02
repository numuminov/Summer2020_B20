package Office_Hours.july7_27;

public class warmups {
    public static void main(String[] args) {
        /*
        Warmup tasks:
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

    3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}

         */
        int[]arr={1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }
        String d="dgytr65799";
        for(int q=0;q<=d.length()-1;q++){
            String st="";
            char ch=d.charAt(q);
            if(ch<48||ch>57){continue;}
            st+=""+ch;
            System.out.print(st);



        }

    }
}
