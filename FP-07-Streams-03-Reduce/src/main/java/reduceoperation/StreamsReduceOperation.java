package reduceoperation;

import java.util.stream.Stream;

public class StreamsReduceOperation {
    public static void main(String[] args) {

        /**
         * Reducing is repeated process of combining all the elements
         * T reduce(<T> identity, BinaryOperator op);
         *
         * identity value is the first value to the operator
         * identity is kinda from where to start your operations, for eg, in case of sum may want to start from 0,
         * and in case of multiplication you may want to start from 1
         *
         * reduction operations parallelize more gracefully, without needing additional synchronization
         * and with greatly reduced risk of data races
         */

        Integer sum = Stream.of(1,5,11,20)
                .reduce(0,(a,b) -> a + b);
                // 0, ((0,1) -> 0 + 1) = 1
                // ((1,5) -> 1 + 5) = 6
                // ((6,11) -> 6 + 11) = 17
                // ((17,20) -> 17 + 20) = 37
        System.out.println(sum);


    }

}
