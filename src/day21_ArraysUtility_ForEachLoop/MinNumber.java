package day21_ArraysUtility_ForEachLoop;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {-5, 20, -15, 50, 0, -25};
        int min = numbers[0];

        for (int eachNumber : numbers) {
            if (eachNumber < min) {
                min = eachNumber;
            }
        }

        System.out.println(min);
    }

}
