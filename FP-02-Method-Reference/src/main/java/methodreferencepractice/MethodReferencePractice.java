package methodreferencepractice;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencePractice {
    public static void main(String[] args) {

        /**
         * 4 types of method references
         * 1 - Object :: instanceMethod
         * 2 - Class :: staticMethod
         * 3 - Class :: instanceMethod
         * 4 - Class :: new
         */



        // Lambda way
        Consumer<Integer> consumer = element -> System.out.println(element);
        // Method reference way
        Consumer<Integer> consumer1 = System.out :: println;

        // Lambda way
        Supplier<Double> supplier = () -> Math.random();
        // Method reference way
        Supplier<Double> supplier1 = Math :: random;

    }

}
