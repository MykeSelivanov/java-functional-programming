package mapoperation;

import java.util.stream.Stream;

public class StreamsMapOperation {
    public static void main(String[] args) {

        /**
         * Stream map(Function mapper)
         * Map operation takes a mapper function, which is basically a function with abstract method 'R apply(T t);'
         *
         * Map function takes each stream element and map it to some other value returned by the mapper function
         */

        Stream.of(1,2,3,4,5,6,7,8,9,10);


    }

}
