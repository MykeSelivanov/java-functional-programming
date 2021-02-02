package consumerpractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPracticeRunner {
    public static void main(String[] args) {

        /**
         * Consumer - takes single argument and does not return any value
         * Consumer<Integer> display = a -> System.out.println(a);
         * display.accept(10);
         */

        // Implementing consumer in a separate class
        Consumer<String> doublePrinter = new StringDoublePrinter();
        doublePrinter.accept("Apple");
        doublePrinter.accept("Oracle");

        // Proper implementation
        Consumer<String> triplePrinter = t -> System.out.println(t + " || " + t + " || " + t);
        triplePrinter.accept("Melon");

        List<String> names = (Arrays.asList("Peter","Jack","John","Marry"));
        names.forEach(triplePrinter);

        // Without storing lambda implementation into separate variable
        names.forEach(name -> System.out.println(name + "->"));

    }

}
