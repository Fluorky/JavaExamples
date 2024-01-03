package other;

interface OperationT<T> {
    T execute(T x, T y);
}

class Calculator<T> implements OperationT<T> {
    @Override
    public T execute(T x, T y) {
        throw new UnsupportedOperationException("The execute() method is not implemented");
    }
}

class AdditionCalculator extends Calculator<Integer> {
    @Override
    public Integer execute(Integer x, Integer y) {
        return x + y;
    }
}

public class InheritanceEx3 {
    public static void main(String[] args) {
        AdditionCalculator calculator = new AdditionCalculator();
        System.out.println("Result of addition: " + calculator.execute(3, 4));
    }
}
