package other;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class DoubleSemicolonEx5 {
    public static void main(String[] args) {
        // Static method reference with a functional interface
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, Integer> stringLength = String::length;

        names.stream()
                .map(stringLength)
                .forEach(System.out::println);

        names.stream().forEach(System.out::print); // stream() is not necessary
        names.forEach(System.out::println);
    }
}
