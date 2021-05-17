package customcollector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class CustomCollector {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,6,8,7,9,0,1,52,5,61,8,9,96,0,18,23);

        // creating custom Collector toList, that will store data in an arraylist
        // in order to create a custom collector, you can use Collector.of() methods from the Collector class
        // as a parameters you need to provide supplier, accumulator, combiner and characteristics
        // in the example below toList collector will be created
        // supplier - will provide an ArrayList
        // accumulator is a BiConsumer, first argument - container to store, second argument - is a current stream element
        // combiner is a BiFunction that takes 2 args - in this case it will take 2 lists, combine them into 1 and return - purpose is to combine all the streams, when you choose to run in parallel
        // last argument is characteristics - we will use the IDENTITY FINISH, since it is the most general one

        // Collector will work on integers, will process a list of ints and will return a list of ints
        Collector<Integer, List<Integer>, List<Integer>> toList = Collector.of(
                () -> new ArrayList<>(),                                         // supplier
                (list, currentStreamElement) -> list.add(currentStreamElement), // accumulator BiConsumer
                (list1, list2) -> {                                             // combiner BiFunction
                    list1.addAll(list2);
                    return list1;
                },
                Collector.Characteristics.IDENTITY_FINISH);                     // characteristics (you can check the documentation)

        // test just created above Collector
        List<Integer> eventNumbers = numbers.stream()
                .filter(element -> element % 2 == 0)
                .collect(toList);
        eventNumbers.forEach(System.out::println);
    }

}
