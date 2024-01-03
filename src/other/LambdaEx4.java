package other;

import java.util.Arrays;
import java.util.List;




public class LambdaEx4 {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            long sum = numbers.parallelStream()
                    .filter(x -> x % 2 == 0)
                    .mapToLong(x -> x * 2)
                    .sum();

            System.out.println("Sum of doubled even numbers: " + sum);
        }

}
