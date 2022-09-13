package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStirrer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        int size = Math.min(firstList.size(), secondList.size());
        List<T> result = new ArrayList<>();

        IntStream.range(0, size).forEach((element) -> {
                result.add(firstList.get(element));
                result.add(secondList.get(element));
                }
        );
        return result.stream();
    }

    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("first","second","third","fourth","fifth","sixth","seventh","eighth");
        Stream<String> secondStream = Stream.of("ninth","tenth","eleventh","twelfth","thirteenth","fourteenth","fifteenth","sixteenth");
        List<String> result = zip(firstStream,secondStream).collect(Collectors.toList());
        System.out.println(result);
    }
}
