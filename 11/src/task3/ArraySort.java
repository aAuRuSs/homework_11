package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraySort {
    private static String arraySort(String[] numbers){
        List<String> number = Arrays.asList(numbers);
        String[] allNumbers = number.stream()
                .flatMap(n -> Arrays.stream(n.replaceAll("\s","").split(",")))
                .sorted()
                .toArray(String[]::new);
        return Arrays.toString(allNumbers);

    }

    public static void main(String[] args) {
        String[] array = new String[]{"1, 2, 0", "4, 5"};
        System.out.println(arraySort(array));
    }
}
