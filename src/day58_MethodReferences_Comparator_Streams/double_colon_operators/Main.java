package day58_MethodReferences_Comparator_Streams.double_colon_operators;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Calculate sum = (x, y) -> System.out.println(x + y);

        Calculate s1 = (x, y) -> Calculator.findSum(x, y);

        // Reference to a Static Method
        Calculate s2 = Calculator::findSum;
        s2.calculate(10, 20);

        // Reference to a Instance Method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;

        Calculate s4 = new Calculator()::findMultiply;


        System.out.println("\n-----------------------------------------------------------\n");


        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> func2 = String::substring;

        Function<Integer, Double> func3 = new MyClass()::method;



    }

}
