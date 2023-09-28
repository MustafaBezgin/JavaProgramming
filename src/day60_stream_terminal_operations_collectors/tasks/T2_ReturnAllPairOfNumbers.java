package day60_stream_terminal_operations_collectors.tasks;

import java.util.Arrays;
import java.util.List;

public class T2_ReturnAllPairOfNumbers {

    public static void main(String[] args) {


        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        numbers1.stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .forEach(pair -> System.out.println(Arrays.toString(pair)));


    }

}
