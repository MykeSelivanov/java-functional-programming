package boundedstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {
    public static void main(String[] args) {

        /**
         * Some of the approaches to build finite or bounded streams
         */

        // 1. stream() on a Collection
        List<Integer> list = List.of(1,4,7,9,4);
        Stream<Integer> streamIntegers = list.stream();

        // how you can stream a Map
        Map<Integer,String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
        Stream<Map.Entry<Integer,String>> entriesStream = map.entrySet().stream();

        Stream<String> valuesStream = map.values().stream();
        Stream<Integer> keysStream = map.keySet().stream();

        // 2. static of() method of Stream class
        Stream<String> streamOfStrings = Stream.of("Hi", "Hey", "Hello");

        // 3. stream() method of Arrays utility class
        Integer [] integerArray = {1,2,3,4,5,6};
        Stream<Integer> streamOfIntegersFromArray = Arrays.stream(integerArray);

        int [] ints = {7,8,9,10};
        IntStream streamOfPrimitiveInts = Arrays.stream(ints);

        // 4. using builder pattern - build Stream
        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1);

        // some code (you can have some extra code)
        // conditions (maybe some conditions to check if to add next element or not)
        builder.add(4);

        // finally, when you need a stream, you can invoke the build() method
        Stream<Integer> integers = builder.build();


    }

}
