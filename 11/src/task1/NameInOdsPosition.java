package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameInOdsPosition {
    private static   String printNameInOdsPosition(List<String> names){
        return IntStream.range(0,names.size())
                .filter(name -> name % 2 != 0)
                .mapToObj(index -> String.format("%d. %s", index,names.get(index)))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Andreww","Dima","Karen","Alex");
        System.out.println(printNameInOdsPosition(names));
    }
}
