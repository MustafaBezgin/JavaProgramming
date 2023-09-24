package day38_Inheritance.shape;

public class Circle extends Shape {

    public double r;
    public static double pi = 3.14;

    public Circle(double r) {
        super("Circle");
        this.r = r;
    }

    public double area() {
        return (r * r) * pi;
    }

    public double perimeter() {
        return 2 * (pi * r);
    }

    public String toString() {
        return name + "{" +
                "r = " + r +
                ", pi = " + pi +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                '}';
    }
}
