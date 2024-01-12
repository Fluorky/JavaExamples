package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DoubleSemicolonEx1 {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "pear", "plum"));

        // Using method reference to print each element of the list
        stringList.forEach(System.out::println);

        stringList.add("orange");

        // Using method reference to print each element of the list
        stringList.forEach(System.out::println);
    }
}
