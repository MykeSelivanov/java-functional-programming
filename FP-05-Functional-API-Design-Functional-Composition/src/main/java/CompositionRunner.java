public class CompositionRunner {
    public static void main(String[] args) {

        /**
         * Composition follows reverse direction to the direction used in chaining
         * When two functions are composed, the second function gets executed first and then the first one is
         * applied on the result returned of the second one
         *
         * a.compose(b) : function b will get executed first and then function a will be executed on the result of b
         */

        Function<Square, Integer> function1 = s -> s.getArea();
        Function<Integer, Double> function2 = area -> Math.sqrt(area);

        // default method in functional interface
        function2.compose(function1);


    }

}
