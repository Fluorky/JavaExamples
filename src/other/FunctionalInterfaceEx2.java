package other;

@FunctionalInterface
interface Operation {
    double execute(double x, double y);
}

public class FunctionalInterfaceEx2 {
    public static void main(String[] args) {
        Operation addition = (x, y) -> x + y;
        Operation multiplication = (x, y) -> x * y;

        Operation sumOfSquares = (x, y) -> Math.pow(addition.execute(x, y), 2);

        System.out.println("Result of sumOfSquares: " + sumOfSquares.execute(2, 3));
    }
}
