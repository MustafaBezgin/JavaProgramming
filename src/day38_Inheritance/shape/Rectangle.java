package day38_Inheritance.shape;

public class Rectangle extends Shape {

    public double w, l;

    public Rectangle(double w, double l) {
        super("Rectangle");
        this.w = w;
        this.l = l;
    }

    public double area() {
        return w * l;
    }

    public double perimeter() {
        return 2 * (w + l);
    }

    public String toString() {
        return name + "{" +
                "w = " + w +
                ", l = " + l +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                '}';
    }
}
