package binaryoperatorpractice;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {

        /**
         * BinaryOperator extends from BiFunction
         * and restricts arguments and return to be of the same type
         */

        BinaryOperator<String> operator = (a,b) -> a + "@" + b;
        String str = operator.apply("Mike","gmail.com");
        System.out.println(str);

    }

}
