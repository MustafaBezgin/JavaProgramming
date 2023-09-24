package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("cydeo", "school"); //

        System.out.println("\n-----------------------------------------------------------\n");

        domain("Cydeo.School@amazon.com");

        System.out.println("\n-----------------------------------------------------------\n");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("\n-----------------------------------------------------------\n");

        nameOfMonth(11);

        System.out.println("\n-----------------------------------------------------------\n");

        nameOfDay(5);
        nameOfDay(8);

        System.out.println("\n-----------------------------------------------------------\n");

        daysInMonth(2, 2001);
        daysInMonth(2, 2020);
        daysInMonth(4, 2001);
        daysInMonth(8, 2023);

        System.out.println("\n-----------------------------------------------------------\n");

        ageGroups(12);
        ageGroups(86);

    }



    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }


    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {  // 95

        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {

        String name = "";

        if (number >= 1 && number <= 7) {

            name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday"
                    : (number == 6) ? "Saturday" : "Sunday";

        } else {
            name = "Invalid";
        }

        System.out.println("Day name = " + name);
    }


    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number, int year) {

        int days = 0;

        if (number >= 1 && number <= 12) {

            if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
                days = 31;
            } else if (number == 4 || number == 6 || number == 9 || number == 11) {
                days = 30;
            } else {

                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
        } else {
            System.out.println("Invalid entry!");
        }

        System.out.println(number + ". month of " + year + " has " + days + " days.");

    }


    // 6. Age Groups
    public static void ageGroups(int age) {

        String ageGroup = "";

        ageGroup = (age >= 1 && age <= 2) ? "Infant" : (age >= 3 && age <= 5) ? "Toddler" : (age >= 6 && age <= 9) ? "Kid" : (age >= 10 && age <= 12) ?
                "Pre-teen" : (age >= 13 && age <= 17) ? "Teenager" : (age >= 18 && age <= 20) ? "Young-adult" : (age >= 21 && age <= 39) ? "Adult" :
                (age >= 40 && age <= 49) ? " Young Middle-Aged Adult" : (age >= 50 && age <= 54) ? "Middle-Aged Adult" : (age >= 55 && age <= 64)
                        ? "Very Young Senior Citizen" : (age >= 65 && age <= 74) ? "Young Senior Citizen" : (age >= 75 && age <= 84) ? "Senior Citizen" :
                        "Old Senior Citizen";

        System.out.println("You are a " + ageGroup);
    }


}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

                        */