package customcollector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class CustomCollector {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,6,8,,9,0,1,52,5,61,8,9,96,0,18,23);

        // in order to create a custom collector, you can use Collector.of() methods from the Collector class
        // as a parameters you need to provide supplier, accumulator, combiner and characteristics
        // in the example below toList collector will be created
        // supplier - will provide an ArrayList
        Collector toList = Collector.of(
                () -> new ArrayList<>(),

        );

    }

}
