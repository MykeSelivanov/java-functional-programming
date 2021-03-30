package numericstreamsmethods;

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

    }

}
