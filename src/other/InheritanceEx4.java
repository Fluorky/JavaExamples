package other;

import java.util.ArrayList;
import java.util.List;

abstract class GenericClass<T> {
    abstract T operation(T x, T y);
}

interface ComplexInterface<T> {
    List<T> process(List<T> data);
}

class AdvancedSystem<T> extends GenericClass<T> implements ComplexInterface<T> {
    @Override
    T operation(T x, T y) {
        // Example implementation of operation for the abstract class
        if (x instanceof Integer && y instanceof Integer) {
            return (T) Integer.valueOf(((Integer) x) + ((Integer) y));
        } else if (x instanceof String && y instanceof String) {
            return (T) ((String) x + (String) y);
        }
        return null;
    }

    @Override
    public List<T> process(List<T> data) {
        // Example implementation of processing for the interface
        List<T> result = new ArrayList<>();
        for (T item : data) {
            if (item instanceof String) {
                result.add((T) ((String) item).toUpperCase());
            } else if (item instanceof Integer) {
                result.add((T) Integer.valueOf(((Integer) item) * 2));
            }
        }
        return result;
    }
}

public class InheritanceEx4 {
    public static void main(String[] args) {
        AdvancedSystem<String> stringSystem = new AdvancedSystem<>();
        String resultString = stringSystem.operation("Hello", " World");
        System.out.println("Operation Result: " + resultString);

        List<String> dataList = new ArrayList<>();
        dataList.add("apple");
        dataList.add("banana");
        dataList.add("cherry");

        List<String> processedList = stringSystem.process(dataList);
        System.out.println("Processed List: " + processedList);

        AdvancedSystem<Integer> integerSystem = new AdvancedSystem<>();
        Integer resultInteger = integerSystem.operation(5, 10);
        System.out.println("Operation Result: " + resultInteger);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<Integer> processedIntList = integerSystem.process(intList);
        System.out.println("Processed List: " + processedIntList);
    }
}
