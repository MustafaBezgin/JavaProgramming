package day35_OOP_Encapsulation.Tasks.restaurant;

import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Mustafa Bezgin", "Üsküdar / İSTANBUL", 5);

        Server server1 = new Server("Halit", 73, 40, true);
        Server server2 = new Server("Ömer", 82, 35, false);
        Server server3 = new Server("Ahmet", 3, 45, true);
        Server server4 = new Server("Nihat", 58, 35, false);

        Server[] servers = {server1, server2, server3, server4};

        restaurant1.servers.addAll(Arrays.asList(servers));

        Chef chef1 = new Chef("Fatih", 44, 55, true);
        Chef chef2 = new Chef("Sinan", 61, 50, false);
        Chef chef3 = new Chef("CT", 39, 60, true);

        Chef[] chefs = {chef1, chef2, chef3};

        restaurant1.chefs.addAll(Arrays.asList(chefs));

        System.out.println(restaurant1);
        System.out.println(restaurant1.servers);
        System.out.println(restaurant1.chefs);



    }


}
