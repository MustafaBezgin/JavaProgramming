package day60_stream_terminal_operations_collectors;

import day59_stream_intermadiate_operations.tasks.Dish;
import day59_stream_intermadiate_operations.tasks.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

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


        System.out.println("\n-----------------FIND FIRST-----------------\n");

        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish.get());


        System.out.println("\n-----------------------------------------------------------\n");


        // PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny =  list1.parallelStream().filter(s -> s.startsWith("J")).findAny();
        Optional<String> findAny2 =  list1.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());
        System.out.println(findAny2.get());


        System.out.println("\n-----------------------------------------------------------\n");


        // MIN AND MAX

        Optional<Dish> dMin =DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));

        System.out.println(dMin.get());
        System.out.println(dMax.get());


    }

}
