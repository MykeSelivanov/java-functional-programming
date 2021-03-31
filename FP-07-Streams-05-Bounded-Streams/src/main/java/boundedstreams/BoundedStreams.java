package boundedstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,4,7,9,4);
        Stream<Integer> streamIntegers = list.stream();

        Map<Integer,String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
        Stream<Map.Entry<Integer,String>> entriesStream = map.entrySet().stream();

        Stream<String> valuesStream = map.values().stream();
        Stream<Integer> keysStream = map.keySet().stream();

        // of() method
        Stream<String> streamOfStrings = Stream.of("Hi", "Hey", "Hello");

        // stream method on arrays class
        Integer [] integerArray = {1,2,3,4,5,6};
        Stream<Integer> streamOfIntegersFromArray = Arrays.stream(integerArray);

        int [] ints = {7,8,9,10};
        IntStream streamOfPrimitiveInts = Arrays.stream(ints);




    }

}
