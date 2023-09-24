package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {


        // AND (&&) - in logical and operator both expressions needs to be true in order to return true.

        String name = "Daniel";
        int age = 34;
        String citizen = "North Korea";

        boolean isEligible = age >= 18 && citizen == "USA"; //false
        //                      18 >= 18 &&  "USA" == "USA"
        //                      true    &&  true ==> true

        System.out.println(name + " is eligible to vote: " + isEligible);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        String name2 = "Josh";

        int creditScore = 800;
        int age2 = 42;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000; // true && true && false = false

        System.out.println(name2 + " is eligible for loan: " + isEligible2);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        // OR (||) - in logical or operator only one expression needs to be true in order to return true.

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >= 18  &&  ('F' == 'M'  ||   'F' == 'F' )
        //                      true     &&   (false       ||   true)
        //                      true   &&    true
        //                      true


        System.out.println(name3 + " is eligible to register: " + isEligible3);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                       false                ||            false

        System.out.println(name4 + " is eligible to apply for US citizenShip: " + isEligible4);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        String student = "Ali";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        //                      false    ||    true

        System.out.println(student + " is eligible for scholarship: " + isEligible5);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        //LOGICAL NOT OPERATOR (!)

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);


        System.out.println("\n\n--------------------------------------------------------\n\n");


        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }

}

