package other;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConstructorEx4 {
    public static void main(String[] args) {
        List<String> unmodifiableList = Collections.unmodifiableList(List.of("A", "B", "C"));

        // Attempting to modify the list will result in an error
        // unmodifiableList.add("D");

        // Using constructor reference in forEach to perform an action on each element
        Consumer<String> printUpperCase = System.out::println;
        unmodifiableList.forEach(printUpperCase);
    }
}
