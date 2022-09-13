package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayToUpperCase {
    private static List<String> sortArrayInUpperCase(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Andreww","Dima","Karen","Alex");
        System.out.println(sortArrayInUpperCase(names));
    }
}
