package day05_StringConcatenation;

public class CarInfo {

    public static void main(String[] args) {

        String year = "2023",
                make = "Peugeot",
                model = "3008",
                miles = "1500",
                color = "Black",
                price = "50000";

        // System.out.println(year + " " + make + " " + model + ", " + miles + " miles, " + color + ", $" + price + ".");

        String car = year + " " + make + " " + model + ", " + miles + " miles, " + color + ", $" + price + ".";

        System.out.println(car);

    }
}
