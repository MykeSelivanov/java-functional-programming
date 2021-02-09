package optionalcreation;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {

        String str = "A String";
        Optional<String> optional = Optional.of(str);

        // empty
        Optional<Integer> empty = Optional.empty();

    }

}
