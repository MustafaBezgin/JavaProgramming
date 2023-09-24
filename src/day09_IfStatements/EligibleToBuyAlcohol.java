package day09_IfStatements;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        int age = 20;

        String result;

        if (age >= 21) {
            result = "Eligible";
        } else {
            result = "NOT eligible";
        }

        System.out.println("The person is " + result + " to buy alcohol.");
    }
}
