package methodreferencepractice;

import java.util.function.Function;

public class ConstructorReferencePractice {
    public static void main(String[] args) {

        /**
         * Constructor reference
         * Class :: new
         * Method reference to a constructor
         */

        // Lambda way
        Function<Runnable, Thread> threadFunction = r -> new Thread(r);
        // Constructor reference
        Function<Runnable, Thread> threadGenerator = Thread :: new;

        // Some lambdas cannot be converted to methods reference and runnable is one of the examples
        Runnable task1 = () -> System.out.println("Task 1 executed");
        Runnable task2 = () -> System.out.println("Task 2 executed");

        // Generate a thread and assign runnable
        Thread thread1 = threadGenerator.apply(task1);
        Thread thread2 = threadGenerator.apply(task2);

        thread1.start();
        thread2.start();

        // More compact syntax
        threadGenerator
                .apply(() -> System.out.println("Task 3 executed"))
                .start();



    }

}
