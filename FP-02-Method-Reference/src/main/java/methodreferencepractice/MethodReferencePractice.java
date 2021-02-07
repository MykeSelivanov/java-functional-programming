package methodreferencepractice;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencePractice {
    public static void main(String[] args) {

        /**
         * 4 types of method references
         *
         * 1 - Object :: instanceMethod
         * Method reference to an instance method of an existing object
         *
         * 2 - Class :: staticMethod
         * Method reference to a static method of a class
         *
         * 3 - Class :: instanceMethod
         *
         *
         * 4 - Class :: new
         */


        // Object :: instanceMethod
        // Lambda way
        Consumer<Integer> consumer = element -> System.out.println(element);
        // Method reference way
        Consumer<Integer> consumer1 = System.out :: println;

        // Class :: staticMethod
        // Lambda way
        Supplier<Double> supplier = () -> Math.random();
        // Method reference way
        Supplier<Double> supplier1 = Math :: random;

        // Lambda way
        BiFunction<String, String, String> biFunction = (a,b) -> A_Class.staticMethod(a, b);
        // Method reference way
        BiFunction<String, String, String> biFunction1 = A_Class :: staticMethod;


    }

}


