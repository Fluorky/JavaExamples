package other;

interface CalculatorT<T> {
    T performOperation(T a, T b);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        CalculatorT<Double> addition = (a, b) -> a + b;
        CalculatorT<Integer> multiplication = (a, b) -> a * b;

        System.out.println("Result of addition: " + addition.performOperation(3.5, 2.7));
        System.out.println("Result of multiplication: " + multiplication.performOperation(3, 4));
    }
}
