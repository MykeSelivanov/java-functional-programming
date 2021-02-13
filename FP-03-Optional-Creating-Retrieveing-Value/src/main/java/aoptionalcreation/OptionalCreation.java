package aoptionalcreation;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {

        /**
         * Optional is a separate object (new object will be created), that wraps the value you need
         * It consumes 16 bytes
         * Optionals are immutable - you can't change the value, once it's created
         * Creating an optionals everywhere can cost performance
         */

        // 3 ways to create optional

        // of method
        String str = "A String";
        Optional<String> optional = Optional.of(str);

        // empty
        Optional<Integer> empty = Optional.empty();

        // nullable
        Optional<String> nullable = Optional.ofNullable(str);
        Optional<String> emptyOptional = Optional.ofNullable(null); // if you're wrapping a null in an optional, you'll get an empty optional

    }

}
