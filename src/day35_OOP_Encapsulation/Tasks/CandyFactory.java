package day35_OOP_Encapsulation.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

        Candy candy1 = new Candy("Ülker Ece", 5, 2, true);
        Candy candy2 = new Candy("Ülker Dido", 7, 3, false);
        Candy candy3 = new Candy("Eti Cin", 4, 4, false);
        Candy candy4 = new Candy("Milka", 2, 8, true);
        Candy candy5 = new Candy("Torku", 10, 0, true);

        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy candy : candies) {
            System.out.println(candy);
        }

    }



}
