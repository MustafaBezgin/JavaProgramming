package day60_stream_terminal_operations_collectors.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T1_SquareOfEachNumber {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> l1ToSquare = l1.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        System.out.println(l1ToSquare);


    }


}
