package day33_Statics.Tasks;

public class Task2_Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Task2_Circle(double radius) {
        this.radius = radius;
        this.diameter = radius*2;
    }

    public double calcArea(){

        double area = (radius * radius) * pi;

        return area;
    }

    public double calcPerimeter(){

        double perimeter = 2 * (pi * radius);

        return perimeter;
    }

    public static void printPi(){
        System.out.println("PI's value is " + pi);
    }


    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", diameter = " + diameter +
                ", pi = " + pi +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }


}
