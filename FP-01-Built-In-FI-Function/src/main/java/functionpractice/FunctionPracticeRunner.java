package functionpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionPracticeRunner {
    public static void main(String[] args) {

        /**
         * Function - Accepts a single parameter and returns a single value
         * Function<Integer, Double> half = a -> a/2.0;
         * System.out.println(half.apply(10));
         */

        Function<String, Integer> lengthGetter = str -> str.length();
        System.out.println(lengthGetter.apply("hey"));

        List<String> names = (Arrays.asList("Pete","Gregory","Johny","Martha","Helen"));

        List<Integer> lengthList = new ArrayList<>();
        names.stream().forEach(name -> lengthList.add(lengthGetter.apply(name)));
        System.out.println(lengthList);

    }


}
