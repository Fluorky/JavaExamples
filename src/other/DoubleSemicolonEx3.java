package other;

import java.util.function.Consumer;

public class DoubleSemicolonEx3 {
    public static void main(String[] args) {
        // Instance method reference
        Consumer<String> printUpperCase = System.out::println;

        String message = "hello";
        printUpperCase.accept(message.toUpperCase());
    }
}
