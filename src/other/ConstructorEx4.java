package other;

import java.util.Collections;
import java.util.List;

public class ConstructorEx4 {
    public static void main(String[] args) {
        List<String> unmodifiableList = Collections.unmodifiableList(List.of("A", "B", "C"));

        // Attempting to modify the list will result in an error
        // unmodifiableList.add("D");
    }
}
