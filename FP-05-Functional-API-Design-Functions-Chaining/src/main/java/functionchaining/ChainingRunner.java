package functionchaining;

public class ChainingRunner {

    /**
     * Function chaining is a technic to chain functions
     * Each function returns an object, allowing the calls to be chained together in a single statement
     * without requiring variables to store the intermediate results
     * Basically chaining is a technique used to simplify code, when multiple functions are applied in a row
     */

    Consumer<String> consumer = s -> System.out.println(s);
    Consumer<String> consumer2 = s -> System.out.println(s);

}
