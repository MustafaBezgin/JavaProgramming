package day31_Constructors.Tasks;

public class Task4_Item {

    public String name;
    public double unitPrice, quantity;

    public Task4_Item(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calCost(){
        double totalPrice = unitPrice * quantity;
        return totalPrice;
    }

    public String toString() {
        return "Task4_Item{" +
                "name = '" + name + '\'' +
                ", unitPrice = $" + unitPrice +
                ", quantity = " + quantity + "kg" +
                ", total price = $" + calCost() +
                '}';
    }

    /*
        public static void main(String[] args) {

        Task4_Item item1 = new Task4_Item("Tomatoes", 3.5, 4);

        System.out.println(item1);
    }
     */


}
