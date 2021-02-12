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

        // orElse, orElseGet
        Integer orElse = optional.orElse(0);
        System.out.println(orElse);

        Integer orElseGet = emptyOptional.orElseGet(() -> 0); // if the optional is null, supply it with this default value
        System.out.println(orElseGet);

        // orElseThrow(exceptionSupplier)
        Integer orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException("The value is not present"));
        System.out.println(orElseThrow);

        // orElseThrow() = get() since java10


    }

}
