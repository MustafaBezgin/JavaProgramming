package day59_stream_intermadiate_operations.tasks;

import static java.util.Comparator.comparing;

public class DishTest {

    public static void main(String[] args) {

        // Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
//              .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println("\n-----------------------------------------------------------\n");


        // Print the length of the name of each dish

        DishData.getAll().stream()
                .map(Dish::getName)
//              .map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);


        System.out.println("\n-----------------------------------------------------------\n");


        // Print three high caloric dish name (>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        System.out.println("\n-----------------------------------------------------------\n");


        // Print all dish name that are below 400 in sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);


    }

}
