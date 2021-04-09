package statelessvsstateful;

import java.util.List;
import java.util.stream.Collectors;

public class StatelessVsStatefulOperations {
    public static void main(String[] args) {

        /**
         * Stateless operations -
         *                        performed one by one on stream elements and they do not need any kind of outside info
         *
         * Stateful operation -
         *                      is one that uses outside info
         */

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);

        // this is an example of poor usage of parallel streams with stateful operation (which should be avoided)
        // since it's running parallel, how different threads should know which element was skipped in the skip() method
        // also without a global counter different threads don't know how to limit() 5
        // always check the javadocs of each method you're trying to used as an intermediate operation in order to check
        // if it's a stateful or stateless method
        List<Integer> collect =
                nums.parallelStream()
                .skip(2)
                .limit(5)
                .collect(Collectors.toList());

    }

}
