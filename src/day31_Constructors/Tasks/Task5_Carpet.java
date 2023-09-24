package day31_Constructors.Tasks;

public class Task5_Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Task5_Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {

        double totalPrice = (width * length) * unitPrice;

        if (isPersian) {
            totalPrice += 200;
        }

        return totalPrice;
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }


}
