package day05_StringConcatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Mustafa";
        String lastName = "Bezgin";
        int age = 25;
        String jobTittle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName + "\n");

        //Full name of the person is _________.
        System.out.println("Full name of the person is " + fullName + ".\n");

        // ______ (Full name) is ______ (age) years old.

        System.out.println(fullName + " is " + age + " years old.\n");

        //Fullname is jobTittle, works at CompanyName, and fullName's salary is salary.

        System.out.println(fullName + " is " + jobTittle + ", works at " + companyName + " and " + fullName + "'s salary is $" + salary + ".\n");





    }
}
