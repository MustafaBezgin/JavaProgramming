package day35_OOP_Encapsulation.Tasks.restaurant;

public class Server {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean isFullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(isFullTime);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

        if (employeeID <= 0){
            System.out.println("Invalid employee ID : " + employeeID);
            System.exit(1);
        }

        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {

        if (hourlyRate < 0){
            System.out.println("Invalid hourly rate : " + hourlyRate + " Employee: " + employeeID);
            System.exit(1);
        }

        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
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
