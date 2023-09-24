package day08_IfStatements;

public class EligibleToBuyCigarettes {

    public static void main(String[] args) {

        byte age = 17;

        boolean eligible = age >= 18;
        boolean notEligible = !eligible; // or "age < 18"

        if (eligible) {

            System.out.println("The person is eligible to buy cigarettes.");
        }

        if (notEligible) {

            System.out.println("The person is not eligible to buy cigarettes.");
        }

    }
}
