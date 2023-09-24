package day31_Constructors.Tasks;

import java.util.Arrays;

public class Task6_4_LocalRestaurant {

    public static void main(String[] args) {

        Task6_3_Restaurant restaurant1 = new Task6_3_Restaurant("Mustafa Bezgin", "Üsküdar / İSTANBUL", 5);

        Task6_1_Server server1 = new Task6_1_Server("Halit", 73, 40, true);
        Task6_1_Server server2 = new Task6_1_Server("Ömer", 82, 35, false);
        Task6_1_Server server3 = new Task6_1_Server("Ahmet", 3, 45, true);
        Task6_1_Server server4 = new Task6_1_Server("Nihat", 58, 35, false);

        Task6_1_Server[] servers = {server1, server2, server3, server4};

        restaurant1.servers.addAll(Arrays.asList(servers));

        Task6_2_Chef chef1 = new Task6_2_Chef("Fatih", 44, 55, true);
        Task6_2_Chef chef2 = new Task6_2_Chef("Sinan", 61, 50, false);
        Task6_2_Chef chef3 = new Task6_2_Chef("CT", 39, 60, true);

        Task6_2_Chef[] chefs = {chef1, chef2, chef3};

        restaurant1.chefs.addAll(Arrays.asList(chefs));

        System.out.println(restaurant1);
        System.out.println(restaurant1.servers);
        System.out.println(restaurant1.chefs);



    }

}
