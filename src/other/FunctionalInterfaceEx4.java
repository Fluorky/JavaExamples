package other;

@FunctionalInterface
interface Modifier<T> {
    T modify(T x);
}

public class FunctionalInterfaceEx4 {
    public static void main(String[] args) {
        Modifier<String> addExclamation = s -> s + "!";
        Modifier<Integer> doubleValue = x -> x * 2;

        System.out.println(addExclamation.modify("Hello"));
        System.out.println(doubleValue.modify(5));
    }
}
