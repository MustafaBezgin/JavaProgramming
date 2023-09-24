package day38_Inheritance.shape;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        circle1.area();
        circle1.perimeter();
        System.out.println(circle1);


        Square square1 = new Square(7);

        square1.area();
        square1.perimeter();
        System.out.println(square1);


        Rectangle rectangle1 = new Rectangle(3, 7);

        rectangle1.area();
        rectangle1.perimeter();
        System.out.println(rectangle1);


    }


}
