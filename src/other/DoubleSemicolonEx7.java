package other;

import java.util.function.Function;

class Converter<T, R> {
    public R convert(T input) {
        // Conversion logic (for illustration, just reversing the string)
        return (R) new StringBuilder(String.valueOf(input)).reverse().toString();
    }
}


public class DoubleSemicolonEx7 {

    public static void main(String[] args) {
        // Constructor reference with a lambda expression

        //This line is wrong
        //Function<String, String> reverseString = new Converter<String, String>(String::new)::convert;

        Function<String, String> reverseString = new Converter<String, String>()::convert;


        String result = reverseString.apply("Hello");
        System.out.println(result);
    }

}





