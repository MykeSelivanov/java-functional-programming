package bgettingvaluefromoptional;

import java.util.Optional;

public class UnwrapValueFromOptional {
    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);

        // get - risky if you're not sure that optional has value
        Integer intValue = optional.get();
        System.out.println(intValue);

        Optional<Integer> emptyOptional = Optional.empty();
//        emptyOptional.get(); // throws NoSuchElement exception

        // isPresent() - returns a boolean
        Integer val = optional.isPresent() ? optional.get() : 0; // zero will become default value
        System.out.println(val);

    }

}
