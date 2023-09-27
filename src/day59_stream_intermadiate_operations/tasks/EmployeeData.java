package day59_stream_intermadiate_operations.tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("202228765", "202225456")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("65464654688", "7494116263")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("6879631399", "16548432316"))
        );

    }

}
