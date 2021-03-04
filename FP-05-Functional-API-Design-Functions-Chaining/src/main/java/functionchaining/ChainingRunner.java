package functionchaining;

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

        Consumer<String>


    }
}
