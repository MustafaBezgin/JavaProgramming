package day35_OOP_Encapsulation.Tasks;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {


        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            System.err.println("Invalid size");
            System.exit(1);
        }

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (numberOfCheeseTopping < 0){

            System.out.println("Invalid number of cheese topping.");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && !(numberOfCheeseTopping <= 3)){

            System.out.println("Invalid number of cheese topping.");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("medium") && !(numberOfCheeseTopping <= 4)){

            System.out.println("Invalid number of cheese topping.");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("large") && !(numberOfCheeseTopping <= 5)){

            System.out.println("Invalid number of cheese topping.");
            System.exit(1);
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if (numberOfPepperoniTopping < 0){

            System.out.println("Invalid number of pepperoni topping.");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && !(numberOfPepperoniTopping <= 4)){

            System.out.println("Invalid number of pepperoni topping.");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("medium") && !(numberOfPepperoniTopping <= 5)){

            System.out.println("Invalid number of pepperoni topping.");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("large") && !(numberOfPepperoniTopping <= 6)){

            System.out.println("Invalid number of pepperoni topping.");
            System.exit(1);
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calcCost(){

        double totalCost = 0;

        if (size.equalsIgnoreCase("small")){
            totalCost += 10;
        } else if (size.equalsIgnoreCase("medium")) {
            totalCost += 12;
        } else {
            totalCost +=14;
        }

        if (numberOfCheeseTopping > 0 || numberOfPepperoniTopping > 0){
            totalCost += (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        }

        return totalCost;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost = $" + calcCost() +
                '}';
    }
}
