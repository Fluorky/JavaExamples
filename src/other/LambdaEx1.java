package other;

interface IntCalculator {
    int performOperation(int a, int b);
}

public class LambdaEx1 {
    public static class Main {
        public static void main(String[] args) {
            IntCalculator addition = (a, b) -> a + b;
            IntCalculator multiplication = (a, b) -> a * b;

            System.out.println("Result of addition: " + addition.performOperation(3, 4));
            System.out.println("Result of multiplication: " + multiplication.performOperation(3, 4));
        }
    }
}
