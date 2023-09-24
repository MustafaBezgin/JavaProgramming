package day13_StringClass;

import day05_StringConcatenation.StudentInfo;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age.");
        int age = input.nextInt();

        System.out.println("Please enter your gender.");
        String gender = input.next();

        input.nextLine();

        System.out.println("Please enter your full name."); // //if the previous scanner' method that's used is not nextLine(), then we need provide one more nextLine Method
        String fullName = input.nextLine();

        System.out.println("Please enter your phone number.");
        long phoneNumber = input.nextLong();

        System.out.println("Please enter your zip code.");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your school name.");
        String schoolName = input.nextLine();

        System.out.println("Please enter your city name.");
        String cityName = input.nextLine();

        System.out.println("Please enter your state name.");
        String stateName = input.next();

        System.out.println("Please enter your building number.");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your street name.");
        String streetName = input.nextLine();

        input.close();

        /*
        System.out.println("1. " + fullName + "\n2. " + age + "\n3. " + gender + "\n4. " + phoneNumber + "\n5. Adress:\n\t\t\t" + buildingNumber + " " + streetName +
                "\n\t\t\t" + cityName + " " + stateName + " " + zipCode + "\n6. " + schoolName);
         */

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: \n\t" + buildingNumber + " " + streetName + "\n\t" + cityName + " " + stateName + " " + zipCode);
        System.out.println("School name: " + schoolName);





    }
}
