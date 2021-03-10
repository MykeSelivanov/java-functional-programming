package currying;

import java.util.function.Function;

public class Currying {
    public static void main(String[] args) {

        /**
         * Currying is a technique that basically restructures a multi-parameter function into multiple functions
         * having single parameter each
         *
         * func(par1,par2) -> par1 + par2 -> result
         * func1(par1) -> func2(par2) -> par1 + par2 -> result
         */

        Function <Integer, Function<Integer,Integer>> func1 = val -> val2 -> val + val2;

        Function<Integer, Integer> func2 = func1.apply(1);

        Integer sum = func2.apply(2);
        System.out.println(sum);

    }

}
