package day56_Lombok_LambdaExpressions;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}