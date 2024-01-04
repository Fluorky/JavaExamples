package other;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

public class DoubleSemicolonEx6 {
    public static void main(String[] args) {
        // Instance method reference with an arbitrary object
        List<String> messages = Arrays.asList("Message 1", "Message 2", "Message 3");

        Printer printer = new Printer();

        // Method reference
        Consumer<String> printMessage = printer::print;

        messages.forEach(printMessage);
    }

}
