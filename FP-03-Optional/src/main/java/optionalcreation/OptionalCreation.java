package optionalcreation;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {

        String str = "A String";
        Optional<String> optional = Optional.of(str);

        // empty
        Optional<Integer> empty = Optional.empty();

        // nullable
        Optional<String> nullable = Optional.ofNullable(str);
        Optional<String> emptyOptional = Optional.ofNullable(null); // if you're wrapping a null in an optional, you'll get an empty optional

    }

}
