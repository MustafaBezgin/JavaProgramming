package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        // SINGLE IF : FOR ONE CONDITION.


        int number = 101;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */

        boolean evenNumber = number%2 == 0; //even number = çift sayı
        boolean oddNumber = ! evenNumber; // not even number. Odd number = tek sayı. "oddNumber = number%2 != 0"

        if(evenNumber){ // false. If(evenNumber)'dan sonra ";" koyma hatasına düşülmemeli. İf parantezi içerisindeki boolean variable ı doğruyla statement çıktısı alınır
            System.out.println(number+" is even number.");
        }

        if(oddNumber){// true. Or if(!evenNumber)...
            System.out.println(number+" is odd number.");
        }


        System.out.println("\n\n--------------------------------------------------------\n\n");



        int n = 200;

        // positive
        if(n > 0){ //if the n is greater than zero, then it's positive
            System.out.println(n+" is positive.");
        }

        // negative
        if(n < 0){ // if n is less than zero, then it's negative
            System.out.println(n+" is negative.");
        }

        // zero
        if(n == 0) {
            System.out.println(n + " is zero.");
        }



    }
}

 // Single if: can be used creating condition for 1 possible output