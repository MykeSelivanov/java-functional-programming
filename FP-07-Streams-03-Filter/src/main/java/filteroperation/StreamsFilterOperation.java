package filteroperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilterOperation {
    public static void main(String[] args) {

        /**
         * Filter
         * filter() - is kinda functional equivalent of if statement
         * takes a Predicate as a parameter - predicate functional interface has method 'boolean test(T t)'
         *
         * Predicate will be executed on each stream element, and all the stream element for which test() method will
         * return true will be returned in a new stream
         */

        Stream.of(34,567,89,90,123,456,77,11,34)
                .filter(integer -> integer%2 == 0)
                .forEach(System.out::println);


    }

}
