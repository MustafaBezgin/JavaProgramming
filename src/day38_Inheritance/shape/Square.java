package day38_Inheritance.shape;

public class Square extends Shape {

    public double s;

    public Square(double s) {
        super("Square");
        this.s = s;
    }

    public double area() {
        return s * s;
    }

    public double perimeter() {
        return 4 * s;
    }

    public String toString() {
        return name + "{" +
                "s = " + s +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                '}';
    }

}
