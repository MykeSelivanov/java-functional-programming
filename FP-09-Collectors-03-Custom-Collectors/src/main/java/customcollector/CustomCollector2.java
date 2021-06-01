package customcollector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class CustomCollector2 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,6,8,7,9,0,1,52,5,61,8,9,96,0,18,23);

        Collector toList = Collector.of(
                () -> new ArrayList<>(),    // supplier
                (list, currentElement) -> list.add(currentElement),     // accumulator - biconsumer
                (list1, list2) -> {
                    list1.addAll(list2);            // BiFunction
                    return list1;
                },
                Collector.Characteristics.IDENTITY_FINISH);

    }

}
