package supplierpractice;

import java.util.function.Supplier;

public class SupplierPracticeRunner {
    public static void main(String[] args) {

        /**
         * Supplier - Does not accept any arguments and returns an object
         * Supplier<Double> randomValue = () -> Math.random();
         * System.out.println(randomValue.get());
         */

        Supplier<String> providedStr = () -> new String("Your String");
        System.out.println(providedStr.get());


    }


}
