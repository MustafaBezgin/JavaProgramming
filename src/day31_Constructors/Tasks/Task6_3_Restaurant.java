package day31_Constructors.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6_3_Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Task6_1_Server> servers = new ArrayList<>();
    public ArrayList<Task6_2_Chef> chefs = new ArrayList<>();


    public Task6_3_Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }


    public void hireServer(Task6_1_Server server){
        servers.add(server);
    }

    public void hireServers(Task6_1_Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Task6_2_Chef chef){
        chefs.add(chef);
    }

    public void hireChefs(Task6_2_Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p -> p.employeeID == employeeID);
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
