package day60_stream_terminal_operations_collectors;

import day59_stream_intermadiate_operations.tasks.Dish;
import day59_stream_intermadiate_operations.tasks.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        System.out.println("\n-----------------toCollection(Supplier)-----------------\n");

        // is used to create a collection using Collector

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);


        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);


        System.out.println("\n-----------------toList()-----------------\n");

        // returns a collector interface that gathers the input data into a new list

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());


        System.out.println("\n-----------------toSet()-----------------\n");

        // returns a collector interface that gathers the input data into a new set

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());


        System.out.println("\n-----------------toMap(Function, Function)-----------------\n");

        // returns a collector interface that gathers the input data into a new map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);


        System.out.println("\n-----------------summingInt(toIntFunction)-----------------\n");

        // returns a collector interface that produce the sum of a Integer-valued func.

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);


        System.out.println("\n-----------------counting()-----------------\n");

        // returns a collector that counts the number of elements

        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(evenCount);


        System.out.println("\n-----------------averagingInt(toIntFunction)-----------------\n");

        // returns the average of the integer passed values

        Double caloriesAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(caloriesAverage);


        System.out.println("\n-----------------joining()-----------------\n");

        // is used to join various elements of character or string array into a single object

        List<String> courses = Arrays.asList("Java", "JS", "TS");

        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);

    }

}
