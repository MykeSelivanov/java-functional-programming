package infinitestreams;

import java.util.Random;
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

        // iterate()
        Stream.iterate(0, i -> i-1)
                .limit(5) // without limit intermediate operation we will get infinite stream
                .forEach(System.out::println);

        // generate(), this method is also available for all the primitive numeric streams
        Stream.generate(() -> "Hello")
                .limit(3)
                .forEach(System.out::println);

        Stream.generate(new Random() :: nextInt)
                .limit(5)
                .forEach(System.out::println);


    }

}
