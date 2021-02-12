package bgettingvaluefromoptional;

import java.util.Optional;

public class UnwrapValueFromOptional {
    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);

        // get
        Integer intValue = optional.get();
        System.out.println(intValue);

    }

}
