package other;

import java.util.Arrays;

@FunctionalInterface //not needed
interface Sorting {
    void sort(int[] array);
}

public class FunctionalInterfaceEx1 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        Sorting sorting = array -> Arrays.sort(array);
        System.out.println("Unsorted numbers: " + Arrays.toString(numbers));

        sorting.sort(numbers);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        int[] numbers2 = {2, 1, 3, 7, 5, 9, 2, 6, 5, 3, 5};

        Sorting sorting2 = Arrays::sort;
        System.out.println("Unsorted numbers: " + Arrays.toString(numbers2));

        sorting2.sort(numbers2);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers2));
    }
}
