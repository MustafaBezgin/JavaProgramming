package day60_stream_terminal_operations_collectors;

import day59_stream_intermadiate_operations.tasks.Dish;
import day59_stream_intermadiate_operations.tasks.DishData;

import java.util.Optional;

public class FindingMatching {

    public static void main(String[] args) {


        System.out.println("\n-----------------ALL MATCH-----------------\n");

        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);


        System.out.println("\n-----------------ANY MATCH-----------------\n");

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }


        System.out.println("\n-----------------NONE MATCH-----------------\n");

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);


        System.out.println("\n-----------------FIND ANY-----------------\n");

        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());


    }

}
