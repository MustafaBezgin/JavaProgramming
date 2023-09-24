package day31_Constructors.Tasks;

public class Task6_2_Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Task6_2_Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void makeOrder(){
        System.out.println(name + " is making an order.");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes.");
    }

    public String toString() {

        if (isFullTime) {
            return "Chefs{" +
                    "name = '" + name + '\'' +
                    ", employeeID = " + employeeID +
                    ", hourlyRate = " + hourlyRate +
                    ", working status = full-time" +
                    '}';
        } else {
            return "Chefs{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", working status = part-time" +
                    '}';
        }
    }



}
