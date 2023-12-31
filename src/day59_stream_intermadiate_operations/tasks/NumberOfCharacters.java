package day59_stream_intermadiate_operations.tasks;

import java.util.Arrays;
import java.util.List;

public class NumberOfCharacters {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .map(i -> i.length())
                .forEach(System.out::println);

    }

}
