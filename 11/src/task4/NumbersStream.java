package task4;

import java.util.stream.Stream;

public class NumbersStream {
    private static Stream<Long> numbers(){
        long a = 25214903917l;
        long c = 11;
        long m = (long) Math.pow(2,48);
        long s = 0;
        return Stream.iterate(s, x -> (a * (x+c) % m));

    }

    public static void main(String[] args) {
        numbers().forEach(System.out::println);
    }
}
