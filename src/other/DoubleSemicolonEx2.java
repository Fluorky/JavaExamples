package other;

import java.util.function.Function;


public class DoubleSemicolonEx2 {
    public static void main(String[] args) {
        // Static method reference
        Function<String, Integer> stringLength = String::length;

        String text = "Hello, World!";
        int length = stringLength.apply(text);

        System.out.println("Length of '" + text + "': " + length);
    }
}
