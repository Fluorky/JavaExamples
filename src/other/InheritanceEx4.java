package other;

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
        // Implementation of operation for the abstract class
        return null;
    }

    @Override
    public List<T> process(List<T> data) {
        // Implementation of processing for the interface
        return null;
    }
}




public class InheritanceEx4 {
    public static void main(String[] args) {
        AdvancedSystem<String> system = new AdvancedSystem<>();
        // Using the advanced system...
    }
}
