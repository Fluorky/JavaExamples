package other;

import java.util.function.Function;

public class FunctionalInterfaceEx3 {
    public static void main(String[] args) {
        Function<Integer, Integer> doubling = x -> x * 2;
        Function<Integer, Integer> addOne = x -> x + 1;

        // Combining functions using andThen
        Function<Integer, Integer> doublingAndAddingOne = doubling.andThen(addOne);

        int result = doublingAndAddingOne.apply(3);
        System.out.println("Result: " + result);
    }
}
