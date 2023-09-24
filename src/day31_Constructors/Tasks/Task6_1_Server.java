package day31_Constructors.Tasks;



public class Task6_1_Server{

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Task6_1_Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {

        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void takeOrder() {
        System.out.println(name + " is taking an order.");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning table.");
    }

    public String toString() {

        if (isFullTime) {
            return "Servers{" +
                    "name = '" + name + '\'' +
                    ", employeeID = " + employeeID +
                    ", hourlyRate = " + hourlyRate +
                    ", working status = full-time" +
                    '}';
        } else {
            return "Servers{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", working status = part-time" +
                    '}';
        }
    }

}
