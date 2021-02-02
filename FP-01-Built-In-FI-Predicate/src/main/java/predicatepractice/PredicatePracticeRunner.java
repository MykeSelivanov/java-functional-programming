package predicatepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePracticeRunner {
    public static void main(String[] args) {

        /**
         * Predicate - accepts a single argument and returns true or false
         * Predicate<Integer> lesserThan = i -> i<10;
         * System.out.println(lesserThan.test(5));
         */

        // One way with implementing Predicate in separate MoreThan5CharChecker class which is redundancy
        Predicate<String> moreThan5Char = new MoreThan5CharChecker();

        List<String> names = new ArrayList<>();
        names.add("Joseph");
        names.add("Peter");
        names.add("Mike");
        names.add("Juliet");

        names.removeIf(moreThan5Char);
        System.out.println(names);

        // More efficient way without separate class
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(11);
        numbers.add(15);
        numbers.add(21);
        numbers.add(27);

        numbers.removeIf(number -> number > 15);
        System.out.println(numbers);


    }

}
