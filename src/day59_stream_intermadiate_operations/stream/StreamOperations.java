package day59_stream_intermadiate_operations.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 6);
//      list.forEach(System.out::println); // Termination operation

        /** INTERMEDIATE OPERATİONS **/

        System.out.println("\n-----------------FILTER-----------------\n");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);


        System.out.println("\n-----------------DISTINCT-----------------\n");

        Stream<Integer> stream1 = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();

        stream1.forEach(System.out::println); // Stream is closed


        System.out.println("\n-----------------LIMIT-----------------\n");

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);


        System.out.println("\n-----------------SKIP-----------------\n");

        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);


        System.out.println("\n-----------------MAP-----------------\n");

        list.stream()
                .map(p -> p * 2)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);


    }

}
