package day10_NastedIf_Ternaries;

public class NestedIfIntro {

    public static void main(String[] args) {

        // Outer and Inner If statements can be any type of if statement (Single if, If…else and Multi-branch If)

        int score = 63;


        if (score >= 0 && score <= 100) {  //if the score is valid.

            if (score >= 60) {
                System.out.println("Passed.");
            } else {
                System.out.println("Failed.");
            }
        } else { //if the score is NOT invalid.

            System.out.println("Invalid Score.");
        }


        System.out.println("\n\n--------------------------------------------------------\n\n");


        int age = 25;
        boolean hasId = false;

        if (hasId) { //if the person has an ID

            if (age >= 21) { // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol.");
            } else { // if the person is less than 21 years old.
                System.out.println("NOT eligible to buy alcohol.");
            }
        } else { // if the person does not have an ID.      // if boolean ın içi true olduğu zaman çıktı alır. O yüzden false denilince else çıkmış oldu.
            System.out.println("You must have an ID to buy alcohol.");
        }


        System.out.println("\n\n--------------------------------------------------------\n\n");


        int number = 8;

        if (number >= 1 && number <= 7) { // if the number is a valid number (1 ~ 7)

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else { //if number is not valid.
            System.out.println("Invalid Number");
        }


    }
}

