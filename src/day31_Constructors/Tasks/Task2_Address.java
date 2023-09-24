package day31_Constructors.Tasks;

public class Task2_Address {

    public String buildingNumber, street, city, state;
    public int zipCode;

    public Task2_Address(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return  buildingNumber + " " +
                 street + " \n" + city + " " +
                state + ", " + zipCode;
    }


    /*
    public static void main(String[] args) {

        Task2_Address address1 = new Task2_Address("7925", "Jones Branch Dr", "McLean", "VA", 22012);

        System.out.println(address1);

    }
    */
}
