package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); //121, Concatenation.

        System.out.println(10 + 20); //30 Addition
        System.out.println(100 - 50);
        System.out.println(10 * 6);


        System.out.println(100 / 3); //33
        System.out.println(10 / 4 ); //2
        System.out.println((double) 10 / 4); //2.5
        System.out.println(10.0 / 4); //2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10d / 4 + "\n\n"); //2.5


        int a = 100;
        double b = a/6; //16.0 (a -> integer, 6 -> integer, result -> 16. We used to double (datatype) ->  16.0

        System.out.println(b);

        double c = a/6d; //16.66666.....
        /*
        double c = a/6d;
        double c = a/6.0;
        double c = (double)a/6;
         */

        System.out.println(c);

        System.out.println("\n\n" + 100d);


        //REMAINDER
        int num1 = 10;
        int num2 = 3;

        int division = num1 / num2; //division variable contains the result of num1 divided by num2
        int remainder = num1 % num2; //remainder variable contains the remainder of num1 by num2.

        System.out.println("\n\n" + division);
        System.out.println(remainder);

        //10 divide by 3 is equal to 3 with a remainder of 1.

        System.out.println("\n\n" + num1 + " divide by " + num2 + " is equal to " + num2 + " with a remainder of " + remainder + ".");

        //What is the remainder of 25 divided 4;

        System.out.println("\n\n" + 25 % 4);


    }


}

/*
    +: Addition
    -: Subtract
    +: Multiplication
    /: Division
    %: Remainder

           in Math:
                10/4 = 2.5
                100/3 = 33.3333333....

           in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33

                integer / integer ===> integer
                decimal / integer ===> decimal
                integer / decimal ===> decimal
                decimal / decimal ===> decimal

            Remainder = numerator - (denominator - result)
                        10 % 3 = 1
                        10 / 3 = 3.333333
                        10 - (3 * 3) = 1

                        45 % 8 = 5
                        45 / 5 = 5,62...
                        45 - (8 * 5) = 5

                        100 % 15 = 10
                        100 / 15 = 6.666...
                        100 - (15 * 6) = 10

*/