package flatmapoperation;

import java.util.stream.Stream;

public class FlatMapOperation {
    public static void main(String[] args) {

        Stream<String> a = Stream.of("One","Two");
        Stream<String> b = Stream.of("Three", "Four");

        // stream of streams
        Stream<Stream<String>> streamOfStreams = Stream.of(a, a);

        // but what if you just want all the elements from stream a and b, without creating a stream of streams?
        // in order to achieve that, we'll have to flatten the individual streams with flatMap() method
        // which takes a mapper (identity function)
        // identity function is a function that takes an element, and returns the same element
        Stream.of(a,b)
                .flatMap(stringStream -> stringStream);


    }

}
