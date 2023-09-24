package day20_Arrays;

import java.util.Scanner;

public class CN_Task4_AverageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many elements do you want this array to content?");
        int number = scan.nextInt();
        int sum = 0;

        int[] myArray = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Please enter an element: ");
            myArray[i] = scan.nextInt();
            sum += myArray[i];
        }

        double averageNumber = (double) sum / number;

        System.out.println("Average Number = " + averageNumber);

    }

}
