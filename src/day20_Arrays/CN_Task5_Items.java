package day20_Arrays;

import java.util.Scanner;

public class CN_Task5_Items {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];
        double[] prices = new double[5];
        double totalPrice = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter an item: ");
            items[i] = scan.nextLine();

            System.out.println("Please enter this item's price: ");
            prices[i] = scan.nextDouble();
            scan.nextLine(); //loop içerisinde nextline dan double geleceğinden koymak zorundayız.

            totalPrice += prices[i];

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\t" + items[i] + "\t\t$" + prices[i]);
        }

        System.out.println("Total Price = " + totalPrice);

    }

}
