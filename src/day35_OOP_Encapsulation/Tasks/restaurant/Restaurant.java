package day35_OOP_Encapsulation.Tasks.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }


    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChefs(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p -> p.getEmployeeID() == employeeID);
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p -> p.getEmployeeID() == employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner = '" + owner + '\'' +
                ", location = '" + location + '\'' +
                ", numberOfStars = " + numberOfStars +
                ", total number of servers = " + servers.size() +
                ", total number of chefs = " + chefs.size() +
                '}';
    }

}
