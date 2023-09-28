package day60_stream_terminal_operations_collectors;

import day59_stream_intermadiate_operations.tasks.Dish;
import day59_stream_intermadiate_operations.tasks.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        int result = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println(sum);
        System.out.println(result);

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a + b);

        System.out.println(result2.get());


        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
//              .reduce((a, b) -> a + b)
                .reduce(Integer::sum)
                .get();

        System.out.println(calTotal);


        // MIN AND MAX

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::min);
        Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum1 = " + sum1.get());


        System.out.println("\n-----------------COUNT-----------------\n");

        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);



    }

}
