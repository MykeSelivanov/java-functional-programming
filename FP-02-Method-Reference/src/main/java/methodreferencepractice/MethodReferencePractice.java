package methodreferencepractice;

import java.util.function.Consumer;

public class MethodReferencePractice {
    public static void main(String[] args) {

        // Lambda way
        Consumer<Integer> consumer = element -> System.out.println(element);
        // Method reference way
        Consumer<Integer> consumer1 = System.out :: println;

        // Lambda way

    }

}
