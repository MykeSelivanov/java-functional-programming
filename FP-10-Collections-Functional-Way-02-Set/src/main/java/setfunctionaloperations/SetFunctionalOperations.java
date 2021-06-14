package setfunctionaloperations;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetFunctionalOperations {
    public static void main(String[] args) {

        Set<Integer> setOfNums = Set.of(3,45,7,32,78,11,-5,111);

        // Traversal
        setOfNums.forEach(num -> System.out.printf("%d ", num));

        System.out.println("\n==============================================================");

        // Filter
        setOfNums.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.printf("%d ", num));

        System.out.println("\n==============================================================");

        // Sorting
        // there is no default sort() method for Set interface, if you want to insert elements in a sorted order,
        // instead of a Hashset you need to use a SortedSet and implement it as a TreeSet class like - SortedSet<Integer> set = new TreeSet<>();
        // but if you want to sort a Hashset, you can still use sorted() method from collections after creating a stream on the set and providing comparator
        // a using hashset and sorted()  method for stream
        System.out.println("stream().sorted()");
        setOfNums.stream()
                .sorted()
                .forEach(num -> System.out.printf("%d ", num));

        // using TreeSet() in collector that will be collecting values in sorted order
        TreeSet<Integer> sortedInATreeSet = setOfNums.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("\nTreeSet");
        sortedInATreeSet.forEach(num -> System.out.printf("%d ", num));

        System.out.println("\n==============================================================");

        // Map
        // map integers to double values
        Set<Double> setOfDoubles = setOfNums.stream()
                .map(num -> Double.valueOf(num))
                .collect(Collectors.toSet());
        setOfDoubles.forEach(num -> System.out.printf("%f ", num));

        System.out.println("\n==============================================================");

        // Reduce
        // calculate sum of all elements present in the Set
        int sum = setOfNums.stream()
                .mapToInt(element -> element)
                .sum();
        System.out.println(sum);

    }

}
