package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Mustafa",
                gender = "Male",
                citizen = "Saudi Arabia";
        int age = 25;

        String result;

        if (gender == "Male" && citizen == "Saudi Arabia" && age >= 21) {
            result = "Eligible to vote";
        } else {
            result = "NOT eligible to vote.";
        }

        System.out.println(name + " is " + result);


    }
}
