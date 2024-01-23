package part_time_tasks.functional_interface;

/*zdefiniować interfejs funkcyjny, którego metoda ma postać generyczną, pierwszy parametr tablica obiektów, drugi parametr to obiekt tego samego typu, zwracana wartość jest typu int
zaimplementuj referencję do metody count_matching
która sprawdza ile razy ten obiekt się pojawia w tablice poprzez referencję do metody
implementujemy to samo przez wyrażenie lambda, która realizuje "count_greater" lambda ma działać w parciu o int*/

import java.util.Arrays;

// Definiujemy interfejs funkcyjny z generyczną metodą

@FunctionalInterface
interface MatchingCounter<T> {
    int countMatching(T[] array, T target);
}

public class fi {

    // Implementacja referencji do metody
    private static <T> int countMatching(T[] array, T target) {
        return (int) Arrays.stream(array).filter(target::equals).count();
    }
    public static void main(String[] args) {

        String[] stringArray = {"apple", "orange", "banana", "apple", "grape"};
        String targetString = "apple";
        // Referencja do metody
        MatchingCounter<String> methodReference = fi::countMatching;
        int resultFromMethodReference = methodReference.countMatching(stringArray, targetString);
        System.out.println("Count using method reference: " + resultFromMethodReference);

        Integer[] intArray = {1, 2, 3, 5, 4, 2, 5};
        int targetInteger = 2;
        // Wyrażenie lambda dla "count_greater"
        MatchingCounter<Integer> lambdaExpression = (array, target) ->
           (int) Arrays.stream(array).filter(e -> e > target).count();

        int resultFromLambdaExpression = lambdaExpression.countMatching(intArray, targetInteger);
        System.out.println("Count using lambda expression: " + resultFromLambdaExpression);

    }



}
