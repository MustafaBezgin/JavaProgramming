package day60_stream_terminal_operations_collectors;

import java.util.Arrays;
import java.util.List;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        Integer result = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println(sum);
        System.out.println(result);

    }

}
