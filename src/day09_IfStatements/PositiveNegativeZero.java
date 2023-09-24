package day09_IfStatements;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        int n = -5;


        //WITH SINGLE IF STATEMENT

        /*
                if(n > 0) {
            System.out.println("Positive");
        }

        if(n < 0) {
            System.out.println("Negative");
        }

        if(n ==0) {
            System.out.println("Zero");
        }
         */


        // MULTI-BRANCH IF STATEMENT

        if (n > 0) {
            System.out.println("Positive.");
        } else if (n < 0) {
            System.out.println("Negative.");
        } else {
            System.out.println("Zero.");
        }

        //OR

        /*
        boolean positive = n > 0;
        boolean negative = n < 0;

        if(positive){
            System.out.println("Positive");
        }else if(negative){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        */


// if & else statement we can NEVER apply for the tasks that requires more than two condition!!

        /*
        if(positive){
            System.out.println("Positive");
        }   //Single if statement

        if(negative){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }    //if & else statement
         */

    }
}

/*
Multi-branch if statement kullanılmazsa bilgisayar tüm if statement ları ayrı ayrı inceleyecektir. Kullanıldığı takdirde ise tek statement ile çözüme ulaşacaktır.
 */

