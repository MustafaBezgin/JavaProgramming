package day56_Lombok_LambdaExpressions;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}