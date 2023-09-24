package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "UK";

        boolean isEligible = age >= 21 && citizen == "USA"; //False

        // Eligible
        if (isEligible) { // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if (!isEligible) { // !False ==> not false==> true
            System.out.println("Not Eligible");
        }


    }
}
