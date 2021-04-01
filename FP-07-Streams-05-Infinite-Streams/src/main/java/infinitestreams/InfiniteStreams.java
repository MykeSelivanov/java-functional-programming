package infinitestreams;

import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {

        /**
         * Infinite is a stream without defined length, when you keep going getting elements in the stream
         *
         * First way - using iterate method()
         * Stream.iterate(seed, unary operator)
         * seed is a starting point and it is an initial input to the unary operator
         * result of the unary operator then becomes new input
         *
         *
         */

        Stream.iterate(0, i -> i-1)
                .limit(5)
                .forEach(System.out::println);

    }

}
