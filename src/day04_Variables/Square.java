package day04_Variables;

public class Square {

    public static void main(String[] args) {

        int side = 15;

        int area = side * side;
        int perimeter = 4 * side;

        System.out.println(area);
        System.out.println(perimeter);

        System.out.println("\n\n--------------------------------------------\n\n");

        double side2 = 7.5;
        double area2 = side2 * side2;
        double perimeter2 = 4 * side2;

        System.out.println(area2);
        System.out.println(perimeter2);

        System.out.println("\n\n--------------------------------------------\n\n");

        System.out.println("side2 = " + side2);
        System.out.println("area2 = " + area2);
        System.out.println("perimeter2 = " + perimeter2);

    }
}
