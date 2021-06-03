package customcollector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollector2 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,6,8,7,9,0,1,52,5,61,8,9,96,0,18,23);

        Collector<Integer, List<Integer>, List<Integer>> toListCollector = Collector.of(
                () -> new ArrayList<>(),    // supplier
                (list, currentElement) -> list.add(currentElement),     // accumulator - BiConsumer
                (list1, list2) -> {
                    list1.addAll(list2);            // combiner - BiFunction
                    return list1;
                },
                Collector.Characteristics.IDENTITY_FINISH);

        List<Integer> evens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(toListCollector);
        evens.forEach(System.out::println);

        System.out.println("===============================");

        // use the overloaded method of Collector.of which takes (supplier, accumulator, combiner, finisher and characteristics)
        // finisher step will be used to sort the list
        // finisher is most commonly used to cast the type of stream elements, but you can also use it for different purposes, like soring in the case below
        Collector<Integer, List<Integer>, List<Integer>> toSortedListCollector = Collector.of(
                () -> new ArrayList<>(),    // supplier
                (list, currentElement) -> list.add(currentElement),     // accumulator - BiConsumer
                (list1, list2) -> {
                    list1.addAll(list2);            // combiner - BiFunction
                    return list1;
                },
                (list) -> {
                    Collections.sort(list);        // finisher
                    return list;
                },
                Collector.Characteristics.UNORDERED);

        List<Integer> sortedList = numbers.stream()
                                        .collect(toSortedListCollector);
        sortedList.forEach(System.out::println);
    }

}
