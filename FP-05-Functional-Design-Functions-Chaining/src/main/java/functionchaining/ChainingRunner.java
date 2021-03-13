package functionchaining;

import java.util.function.Function;

public class ChainingRunner {
    public static void main(String[] args) {

        /**
         * Function chaining is a technic to chain functions
         * Each function returns an object, allowing the calls to be chained together in a single statement
         * without requiring variables to store the intermediate results
         * Basically chaining is a technique used to simplify code, when multiple functions are applied in a row
         */

        Consumer<String> consumer1 = s -> System.out.println(s);
        Consumer<String> consumer2 = s -> System.out.println(s);

//        consumer1.accept("Hello");
//        consumer2.accept("Hello");

        Consumer<String> consumer3 = s -> {
            consumer1.accept(s);
            consumer2.accept(s);
        };
        consumer3.accept("Hello");

        // Chaining functions
        Consumer<String> chainedConsumer = consumer1.andThen(consumer2);
        // accept call triggers the complete chain developed in default method in Consumer
        chainedConsumer.accept("This is chained");

        // built in Function also has default andThen method, which accepts the output return from the first function
        // and pass further to other function to operate on
        Function<Integer, Integer> function1 = num -> num + 2;
        Function<Integer, Integer> function2 = num -> num * 2;

        // function1 will be executed first, and then function2 will be executed on the result returned by function1
        Function<Integer, Integer> functionChaining = function1.andThen(function2);
        // function1 -> 10 + 2 = 12 andThen function2 -> 12 * 2 = 24
        System.out.println(functionChaining.apply(10));

    }
}
