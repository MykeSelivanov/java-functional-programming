package bifunctionpractice;

import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {

        /**
         * BiFunction takes 2 arguments and returns 1 value
         * arguments and return can be same as well as different type
         */

        BiFunction<String,String,String> biFunction = (str, str1) -> str + str1;
        System.out.println(biFunction.apply("Hello","World"));

        BiFunction<Character, String, Integer> biFunction1 = (character, s) -> (character + s).length();
        System.out.println(biFunction1.apply('H',"ello"));

    }

}
