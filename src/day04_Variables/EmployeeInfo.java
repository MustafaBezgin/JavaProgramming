package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*
        6. Create a class named EmployeeInfo. declare the following variables:
				1. name (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
         */

        String name = "Maria";
        int age = 24;
        char gender = 'F';
        String company = "Apple Inc";
        String jobTittle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "A101";
        String SSN = "(123)-45-6789";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTittle = " + jobTittle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = $" + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);


    }
}
