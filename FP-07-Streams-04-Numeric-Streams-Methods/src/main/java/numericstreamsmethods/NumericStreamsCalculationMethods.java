package numericstreamsmethods;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsCalculationMethods {
    public static void main(String[] args) {

        // IntStream
        // LongStream
        // DoubleStream

        // Sum
        int sum = IntStream.of(1,2,3,4,5)
                .sum();
        System.out.println(sum);

        // max() - returns an optional, but primitive version of optional
        // in case of empty stream, empty optional will be returned
        OptionalInt maxOptional = IntStream.of(5,6,7,8)
                .max();
        System.out.println(maxOptional.getAsInt());

        // min() - also returns a primitive optional
        OptionalInt minOptional = IntStream.of(3,4,-5)
                .min();
        System.out.println(minOptional.getAsInt());


    }

}
