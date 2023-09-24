package day10_NastedIf_Ternaries;

public class TernariesIntro {

    public static void main(String[] args) {

        /*
        TERNARIES: shortcut of if statement. Yalnızca tüm else-if blokları aynı datatype ise ternary kullanabiliriz.

        if:        (Condition)?
 	    else:                 :
       	else if:   :(Condition)?
         */


        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); // String
        } else {
            System.out.println("Odd"); //String
        }

        System.out.println("\n--------------------------------------------------------\n");


        String result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("\n--------------------------------------------------------\n");

        int age = 17;
        /*
        if(age >= 21){
            System.out.println("Eligible");   //String
        }else{
            System.out.println("Not eligible");  // String
        }
         */

        // System.out.println( (age >= 21) ? "Eligible"  :   "Not eligible"    );
        String result2 = (age >= 21) ? "Eligible" : "Not eligible";
        System.out.println(result2);


        System.out.println("\n--------------------------------------------------------\n");

        int number = 100;

        /*
        if(number>0){
            System.out.println("Positive");
        }else if(number <0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
          */

        String result3 = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println(result3);


    }
}
