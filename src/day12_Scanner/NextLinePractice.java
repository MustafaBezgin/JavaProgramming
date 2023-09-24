package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA: ");
        double GPA = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolName = " + schoolName);


        input.close();

    }
}

/*
/*
1. Ask the user to enter age (nextInt() )
2. Ask the user to enter full name (nextLine() )
 */